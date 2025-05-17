package com.jan.analytics_service.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jan.analytics_service.service.AnalyticsService;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/monthly-summary/{userId}")
    public ResponseEntity<Map<String, Double>> monthly(@PathVariable Long userId) {
        return ResponseEntity.ok(analyticsService.getMonthlySummary(userId));
    }

    @GetMapping("/by-category/{userId}")
    public ResponseEntity<Map<String, Double>> category(@PathVariable Long userId) {
        return ResponseEntity.ok(analyticsService.getCategoryBreakdown(userId));
    }
}

