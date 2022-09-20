package com.naljava.commons.init;

import com.naljava.models.systeminfos.domain.SystemInfo;
import com.naljava.models.systeminfos.service.SystemInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
@Transactional
@RequiredArgsConstructor
public class AppStartRunner implements ApplicationRunner {

    private final SystemInfoService systemInfoService;

    @Value("${init_data}")
    private boolean initData;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        LocalDateTime now = LocalDateTime.now();

        generateSystemInfo("SERVER_START_TIME", now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));// 서버 실행시간 기록

        if (initData) {

        }
    }

    /**
     * 시스템 정보 생성
     */
    private void generateSystemInfo(String name, String value) {
        SystemInfo systemInfo = systemInfoService.findByName(name);
        if (ObjectUtils.isEmpty(systemInfo)) {
            systemInfo = SystemInfo.builder()
                    .name(name)
                    .value(value)
                    .build();
            systemInfo = systemInfoService.save(systemInfo);
        } else {
            systemInfo.update(value);
        }
    }

}
