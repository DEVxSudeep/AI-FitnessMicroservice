package com.fitnes.activityservice.contoller;

import com.fitnes.activityservice.dto.ActivityRequest;
import com.fitnes.activityservice.dto.ActivityResponse;

import com.fitnes.activityservice.service.ActivityService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-activities")
@RequiredArgsConstructor
public class ActivityController {
    private final ActivityService activityService;

    @PostMapping("/add")
    public ResponseEntity<ActivityResponse> addActivity(@RequestBody ActivityRequest activityRequest){
        return ResponseEntity.ok(activityService.addUserActivity(activityRequest));
    }

    @GetMapping("/track/{userId}")
    public ResponseEntity<List<ActivityResponse>> getUserActivities(@PathVariable String userId){
        return ResponseEntity.ok(activityService.getUserActivities(userId));

    }
}
