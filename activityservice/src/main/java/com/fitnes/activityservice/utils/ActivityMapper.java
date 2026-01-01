package com.fitnes.activityservice.utils;

import com.fitnes.activityservice.dto.ActivityRequest;
import com.fitnes.activityservice.dto.ActivityResponse;
import com.fitnes.activityservice.model.Activity;

import java.time.LocalDateTime;

public class ActivityMapper {

    public static ActivityResponse toResponse(Activity request){

        ActivityResponse res=new ActivityResponse();
        res.setId(request.getId());
        res.setUserId(request.getUserId());
        res.setUpdatedAt(request.getUpdatedAt());
        res.setCreatedAt(request.getCreatedAt());
        res.setActivityType(request.getActivityType());
        res.setDuration(request.getDuration());
        res.setCalorieBurned(request.getCalorieBurned());
        res.setUpdatedAt(request.getUpdatedAt());
        res.setCreatedAt(request.getCreatedAt());
        res.setAddionalMetric(request.getAdditionalMetric());
        res.setStartTime(request.getStartTime());
        return res;
    }
    public static Activity buildActivity(ActivityRequest req){
        if (req.getStartTime() == null) {
            req.setStartTime(LocalDateTime.now());
        }

        return Activity.builder()
                .userId(req.getUserId())
                .activityType(req.getActivityType())
                .duration(req.getDuration())
                .calorieBurned(req.getCalorieBurned())
                .additionalMetric(req.getAddionalMetric())
                .startTime(req.getStartTime())
                .build();

    }

}
