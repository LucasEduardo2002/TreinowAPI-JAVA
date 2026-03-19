package com.example.TreinowAPI.dto;

import jakarta.validation.constraints.NotBlank;

public record WorkoutDTO(
        @NotBlank(message = "O título do treino não pode ser vazio")
        String title,

        @NotBlank(message = "A descrição é obrigatória")
        String description,

        @NotBlank(message = "O grupo muscular alvo é obrigatório")
        String targetMuscleGroup
) {}