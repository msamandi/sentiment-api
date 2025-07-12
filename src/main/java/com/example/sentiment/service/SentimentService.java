package com.example.sentiment.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class SentimentService {
    public Map<String, String> analyze(String review) {

        String sentiment="";
        if (review == null) return Collections.singletonMap("sentiment", "neutral");;

        String lower = review.toLowerCase();

        if (lower.contains("love") || lower.contains("great") || lower.contains("amazing")) {
            sentiment= "positive";
        } else if (lower.contains("bad") || lower.contains("terrible") || lower.contains("awful")) {
            sentiment= "negative";
        }
        return Collections.singletonMap("sentiment", sentiment);
    }
}