package com.rosan.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/ticket")
public class TicketBookingRestController {
	private int count = 1;

	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "dummyBookTicket")
	public String bookTicket() {
		System.out.println("TicketBookingRestController.bookTicket()");
		if (new Random().nextInt(10) < 10) {
			throw new RuntimeException("Problem in b. logic");
		}
		return "Output from b. logic";
	}

	public String dummyBookTicket() {
		System.out.println("TicketBookingRestController.dummyBookTicket() :: " + count++);
		return "Sorry Please try later !!!";
	}
}
