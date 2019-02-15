package com.example.lab4subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

	@Autowired
	ArticleClient articleClient;
	
	@Autowired
	AdjectiveClient adjectiveClient;
	
	@Autowired
	SubjectClient subjectClient;
	
	@Autowired
	NounClient nounClient;
	
	@Autowired
	VerbClient verbClient;
	
	@Override
	public String buildSentence() {

		return String.format("%s %s %s %s %s.",
				subjectClient.getWord(),
				verbClient.getWord(),
				articleClient.getWord(),
				adjectiveClient.getWord(),
				nounClient.getWord());
	}

}
