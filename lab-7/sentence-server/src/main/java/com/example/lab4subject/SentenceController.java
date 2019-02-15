package com.example.lab4subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {
	
	@Autowired
	SentenceService sentenceService;
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		
		return sentenceService.buildSentence();
		
	}
	
}
