package com.fitness.aicoachservice.controller;


import com.fitness.aicoachservice.dto.RecommendationResponse;
import com.fitness.aicoachservice.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recommendation")
@RequiredArgsConstructor
public class RecommendationController {
    private final RecommendationService recommendationService;


    @GetMapping("/{userId}")
    public ResponseEntity<List<RecommendationResponse>> getUserRecommendation(@PathVariable  String userId){
        return ResponseEntity.ok(recommendationService.getUserRecommendation(userId));

    }

    @GetMapping("/activity/{activityId}")
    public ResponseEntity<RecommendationResponse> getActivityRecommendation(@PathVariable  String activityId){
        return ResponseEntity.ok(recommendationService.getActivityRecommendation(activityId));

    }


}
