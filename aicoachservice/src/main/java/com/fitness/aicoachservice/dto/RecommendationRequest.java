package com.fitness.aicoachservice.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RecommendationRequest {
    private String activityId;
    private String userId;
    private String activityType;


}
