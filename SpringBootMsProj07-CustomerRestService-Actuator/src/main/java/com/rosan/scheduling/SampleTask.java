package com.rosan.scheduling;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SampleTask {

//	@Scheduled(fixedDelay = 1000)
	public void tester() {
		System.out.println("SampleTask.tester() :: " + new Date());
	}
}
