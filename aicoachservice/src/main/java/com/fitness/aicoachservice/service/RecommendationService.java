package com.fitness.aicoachservice.service;

import com.fitness.aicoachservice.dto.RecommendationResponse;
import com.fitness.aicoachservice.repo.RecommendationRepo;
import com.fitness.aicoachservice.utils.RecommendationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {
    private final RecommendationRepo recommendationRepo;

    public List<RecommendationResponse> getUserRecommendation(String userId){
        return recommendationRepo.findByUserId(userId).stream()
                .map(RecommendationMapper::toResponse).toList();
    }


    public RecommendationResponse getActivityRecommendation(String activityId){
        return recommendationRepo.findByActivityId(activityId)
                .map(RecommendationMapper::toResponse)
                .orElseThrow(() ->
                        new RuntimeException("Recommendation not found for activity: " + activityId)
                );

    }
}
