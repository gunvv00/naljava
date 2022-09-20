package com.naljava.models.schedules.infra.schedule;

import com.naljava.models.schedules.domain.schedule.Schedule;
import com.naljava.models.schedules.domain.schedule.repo.ScheduleRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaScheduleRepository extends JpaRepository<Schedule, Long>, ScheduleRepository {
}
