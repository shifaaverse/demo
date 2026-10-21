package com.example.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OrderReqDto(

        @NotBlank
        String CustomerName,

        @NotBlank
        String RestaurantName,

        @NotNull
        Integer totalPrice,

        @NotNull
        Boolean isDelivered
) {
}
