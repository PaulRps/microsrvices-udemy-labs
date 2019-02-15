package com.example.lab4subject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Subject")
public interface SubjectClient {
	
	@GetMapping("/")
	public String getWord();

}
