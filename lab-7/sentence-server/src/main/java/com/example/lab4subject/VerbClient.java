package com.example.lab4subject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Verb")
public interface VerbClient {
	
	@GetMapping("/")
	public String getWord();

}
