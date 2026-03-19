package com.example.TreinowAPI.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String targetMuscleGroup; // Ex: Peito, Costas, Perna

    // Construtor vazio exigido pelo JPA
    public Workout() {}

    public Workout(String title, String description, String targetMuscleGroup) {
        this.title = title;
        this.description = description;
        this.targetMuscleGroup = targetMuscleGroup;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getTargetMuscleGroup() { return targetMuscleGroup; }
    public void setTargetMuscleGroup(String targetMuscleGroup) { this.targetMuscleGroup = targetMuscleGroup; }
}