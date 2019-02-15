package com.example.lab4subject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Noun")
public interface NounClient {
	
	@GetMapping("/")
	public String getWord();

}
