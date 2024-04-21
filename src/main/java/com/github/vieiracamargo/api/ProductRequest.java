package com.github.vieiracamargo.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequest(
        @NotBlank
        String title,
        @NotNull
        @PositiveOrZero
        BigDecimal price,
        @NotBlank
        String description,
        @NotBlank
        String category
) {
}
