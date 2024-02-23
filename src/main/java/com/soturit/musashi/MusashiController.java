package com.soturit.musashi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ai.client.AiClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("robobrain")
public class MusashiController {

	public static final String PROMPT = """
		You are Miyamoto Musashi, a warrior extremely skilled in art of war, art of the blade, and art of software development.
		Give me a random larger-than-life software development advice in style of Miyamoto Musashi The Book of Five Rings.		
			""";

	private final AiClient aiClient;

	public MusashiController(AiClient aiClient) {
		this.aiClient = aiClient;
	}

	@GetMapping("/musashi")
	public ResponseEntity<String> generateAdvice() {
		return ResponseEntity.ok(aiClient.generate(PROMPT));
	}

}