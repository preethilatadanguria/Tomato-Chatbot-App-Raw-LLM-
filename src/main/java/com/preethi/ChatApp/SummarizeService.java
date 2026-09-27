package com.preethi.ChatApp;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class SummarizeService {

	private ChatClient chatClient;
	public SummarizeService(ChatClient.Builder builder) {
		this.chatClient = builder.build();
	}

		
	public String summarize(String ticket) {
		
		String outputString=chatClient.prompt().user("Summarize this support ticket in 2 lines : \n\n" + ticket).call().content();
		return outputString;
	}
}
