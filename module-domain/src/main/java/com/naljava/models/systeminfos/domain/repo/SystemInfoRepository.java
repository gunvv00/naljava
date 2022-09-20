package com.naljava.models.systeminfos.domain.repo;

import com.naljava.models.systeminfos.domain.SystemInfo;

public interface SystemInfoRepository {

    SystemInfo findByName(String key);

    SystemInfo save(SystemInfo systemInfo);
}
