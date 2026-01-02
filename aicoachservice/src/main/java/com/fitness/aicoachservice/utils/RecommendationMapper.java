package com.fitness.aicoachservice.utils;

import com.fitness.aicoachservice.model.Recommendation;
import com.fitness.aicoachservice.dto.RecommendationResponse;

public class RecommendationMapper {

    public static RecommendationResponse toResponse(Recommendation rec) {

        if (rec == null) return null;

        RecommendationResponse res = new RecommendationResponse();

        res.setId(rec.getId());
        res.setActivityId(rec.getActivityId());
        res.setUserId(rec.getUserId());
        res.setActivityType(rec.getActivityType());

        res.setRecommendation(rec.getRecommendation());
        res.setImprovements(rec.getImprovements());
        res.setSuggestions(rec.getSuggestions());
        res.setSafety(rec.getSafety());

        res.setCreatedAt(rec.getCreatedAt());
        res.setUpdatedAt(rec.getUpdatedAt());

        return res;
    }


    public static Recommendation toEntity(RecommendationResponse res) {

        if (res == null) return null;

        return Recommendation.builder()
                .id(res.getId())
                .activityId(res.getActivityId())
                .userId(res.getUserId())
                .activityType(res.getActivityType())

                .recommendation(res.getRecommendation())
                .improvements(res.getImprovements())
                .suggestions(res.getSuggestions())
                .safety(res.getSafety())

                .createdAt(res.getCreatedAt())
                .updatedAt(res.getUpdatedAt())
                .build();
    }
}
