
package com.example.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record BookingReqDto(
        @NotBlank(message = "Guest name is mandatory")
        String guestName,

        @NotNull(message = "Room number is mandatory")
        @Positive(message = "Room number must be positive")
        Integer roomNumber,

        @NotNull(message = "Number of nights is mandatory")
        @Positive(message = "Number of nights must be positive")
        Integer numberOfNights,

        @NotNull(message = "Prepaid status is mandatory")
        Boolean isPrepaid
) {
}
