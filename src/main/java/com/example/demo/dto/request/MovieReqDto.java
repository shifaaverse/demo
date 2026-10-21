
package com.example.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record MovieReqDto(
        @NotBlank(message = "Title is mandatory")
        String title,

        @NotBlank(message = "Genre is mandatory")
        String genre,

        @NotNull(message = "Runtime is mandatory")
        @Positive(message = "Runtime must be positive")
        Integer runtimeMinutes,

        @NotNull(message = "Premium status is mandatory")
        Boolean isPremium
) {
}
