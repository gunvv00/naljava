package com.naljava.models.systeminfos.service;

import com.naljava.models.systeminfos.domain.SystemInfo;
import com.naljava.models.systeminfos.domain.repo.SystemInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SystemInfoService {

    private final SystemInfoRepository repository;

    public SystemInfo findByName(String name) {
        return repository.findByName(name);
    }

    public SystemInfo save(SystemInfo systemInfo) {
        return repository.save(systemInfo);
    }
}
