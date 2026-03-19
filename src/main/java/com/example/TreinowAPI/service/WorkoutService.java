package com.example.TreinowAPI.service;

import com.example.TreinowAPI.domain.Workout;
import com.example.TreinowAPI.dto.WorkoutDTO;
import com.example.TreinowAPI.repository.WorkoutRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WorkoutService {

    private final WorkoutRepository repository;

    public WorkoutService(WorkoutRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Workout createWorkout(WorkoutDTO dto) {
        Workout workout = new Workout(
                dto.title(),
                dto.description(),
                dto.targetMuscleGroup()
        );
        return repository.save(workout);
    }
}
