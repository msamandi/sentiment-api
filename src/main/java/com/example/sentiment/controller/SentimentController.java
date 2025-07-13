package com.example.sentiment.controller;

import com.example.sentiment.model.ReviewRequest;
import com.example.sentiment.service.SentimentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class SentimentController {
    private final SentimentService sentimentService;

    public SentimentController(SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }
    @PostMapping("/analyze")
    public ResponseEntity<Map<String, String>> analyze(@RequestBody ReviewRequest reviewRequest) {
        Map<String, String>  sentiment = sentimentService.analyze(reviewRequest.getReview());

        return ResponseEntity.ok(sentiment);
    }
    @GetMapping("/custom-health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }
}