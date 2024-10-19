package com.rosan.producer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rosan.consumer.MessageStore;

@RestController
public class MessagingOperationsController {
	@Autowired
	private MessageProducer  producer;
	@Autowired
	private MessageStore store;
	
	@GetMapping("/send")
	public   ResponseEntity<String>  sendMessage(@RequestParam("message") String msg){
		//use producer
		String statusMsg=producer.sendMessage(msg);
		//return the ResponseEntity<String,String> object
		ResponseEntity<String> response=new ResponseEntity<String>(statusMsg,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/readAll")
	public  ResponseEntity<String>  showAllMessages(){
		//get All messages
		 List<String>  list=store.getAllMessages();
		return new ResponseEntity<String>("<h1>"+list+"</h1>",HttpStatus.OK);
	}
}
