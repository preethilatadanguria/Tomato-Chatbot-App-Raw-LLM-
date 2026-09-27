package com.preethi.ChatApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

public class ChatController {
	
	@Autowired
	private ChatService summarizeService;
	
	@PostMapping("/chat")
	public String chat(@RequestBody String message)
	{
		return summarizeService.chat(message);
	}
}
