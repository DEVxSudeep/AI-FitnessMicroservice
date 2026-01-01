package com.fitnes.activityservice.service;

import com.fitnes.activityservice.dto.ActivityRequest;
import com.fitnes.activityservice.dto.ActivityResponse;
import com.fitnes.activityservice.model.Activity;
import com.fitnes.activityservice.repo.ActivityRepo;
import com.fitnes.activityservice.utils.ActivityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private final ActivityRepo activityRepo;

    public ActivityResponse addUserActivity(ActivityRequest activityRequest) {
        //System.out.println(activityRequest.toString());
        Activity savedActivity=activityRepo.save(ActivityMapper.buildActivity(activityRequest));
        return ActivityMapper.toResponse(savedActivity);
    }

    public List<ActivityResponse> getUserActivities(String userId){
        List<ActivityResponse> responses = new ArrayList<>();
        for (Activity a : activityRepo.findByUserId(userId)) {
            responses.add(ActivityMapper.toResponse(a));}
        return responses;
    }
}
