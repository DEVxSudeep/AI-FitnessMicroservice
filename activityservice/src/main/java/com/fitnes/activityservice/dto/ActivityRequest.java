package com.fitnes.activityservice.dto;

import com.fitnes.activityservice.model.ActivityType;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ActivityRequest {
    private String userId;
    private ActivityType activityType;
    private Integer duration;
    private  Integer calorieBurned;
    private Map<String,Object> addionalMetric;
    private LocalDateTime startTime;
}
