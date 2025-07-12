package com.example.sentiment;

import com.example.sentiment.service.SentimentService;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SentimentServiceTest {

    private final SentimentService service = new SentimentService();

    @Test
    public void testPositiveSentiment() {

        assertEquals(Map.of("sentiment","positive"), service.analyze("This is amazing!"));
    }

    @Test
    public void testNegativeSentiment() {
        assertEquals(Map.of("sentiment","negative"), service.analyze("This is terrible."));
    }

    @Test
    public void testNeutralSentiment() {
        assertEquals(Map.of("sentiment",""), service.analyze("It is okay."));
    }

    @Test
    public void testNullReview() {
        assertEquals(Map.of("sentiment","neutral"), service.analyze(null));
    }
}