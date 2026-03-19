package com.example.TreinowAPI.controller;

import com.example.TreinowAPI.domain.Workout;
import com.example.TreinowAPI.dto.WorkoutDTO;
import com.example.TreinowAPI.service.WorkoutService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    private final WorkoutService service;

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Workout> create(@Valid @RequestBody WorkoutDTO dto) {
        Workout savedWorkout = service.createWorkout(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedWorkout);
    }
}