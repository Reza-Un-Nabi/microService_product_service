package com.example.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.utility.ResponseMessage;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/greet")
public class ProductController {
	
	@Value("${server.port}") 
	private int port;



	@GetMapping("/greeting/{greet}")
	public ResponseEntity<?> getMessage (@PathVariable("greet") String greet) {
		
		ResponseMessage resMessage = new ResponseMessage();
		String replyMessage="Are you?";
		
		resMessage.setStatus("ok");
		resMessage.setType("save");
		resMessage.setMessage(greet+"  "+replyMessage);
		
		return ResponseEntity.ok(resMessage);
	}


}
