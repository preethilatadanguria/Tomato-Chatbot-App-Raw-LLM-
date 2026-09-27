package com.preethi.ChatApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")


public class SummarizeController {
	
	@Autowired
	private SummarizeService summarizeService;
	
	@PostMapping("/summarize")
	public String summarizer(@RequestBody String ticket)
	{
		return summarizeService.summarize(ticket);
	}
}
