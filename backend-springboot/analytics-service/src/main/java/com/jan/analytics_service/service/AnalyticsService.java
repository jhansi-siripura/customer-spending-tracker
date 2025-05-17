package com.jan.analytics_service.service;

import java.util.Map;

public interface AnalyticsService {

	Map<String, Double> getMonthlySummary(Long userId);

	Map<String, Double> getCategoryBreakdown(Long userId);

}
