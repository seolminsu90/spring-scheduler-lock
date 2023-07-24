package com.sample.scheduler.shedlock;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "PT30S") // https://en.wikipedia.org/wiki/ISO_8601#Durations  형식에 따른 시간 기본값,  java.time.Duration.parse(CharSequence),
public class SpringSchedulerLockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerLockApplication.class, args);
	}

}
