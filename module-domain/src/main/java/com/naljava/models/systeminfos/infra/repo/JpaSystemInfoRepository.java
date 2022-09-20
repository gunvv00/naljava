package com.naljava.models.systeminfos.infra.repo;

import com.naljava.models.systeminfos.domain.SystemInfo;
import com.naljava.models.systeminfos.domain.repo.SystemInfoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSystemInfoRepository extends JpaRepository<SystemInfo, Long>, SystemInfoRepository {
}
