package com.example.lab4subject;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Adjective")
public interface AdjectiveClient {

	@GetMapping("/")
	public String getWord();
}
