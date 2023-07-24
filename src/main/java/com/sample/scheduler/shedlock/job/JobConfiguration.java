package com.sample.scheduler.shedlock.job;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JobConfiguration {
    @Scheduled(cron = "*/10 * * * * ?")
    @SchedulerLock(
            name = "TaskScheduler_scheduledTask", // 고유 값
            lockAtLeastFor = "5s", // 최소 5초간 잠김 상태로 처리된다는 의미.
            lockAtMostFor = "9s" // 실행 중인 노드가 죽을 경우 잠금을 유지해야 하는 기간 (여기에선 9초)
    )
    public void scheduledTask() {
        log.info("JOB WORKING !!!");
    }

    // 실행(잠금 - lockAtLeastFor) -> 완료시 (잠금 해제) -> 메서드 동작 간 {time} 이내의 중복된 요청은 무시됨.
    // 실행(잠금 - lockAtLeastFor) -> 실패시 (잠금 해제) -> 실패 시 {time}} 동안 잠금 상태 유지됨.
}
