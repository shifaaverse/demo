package com.example.demo.dto.response;

public record BookingResDto(
        Long id,
        String guestName,
        int roomNumber,
        int numberOfNights,
        boolean isPrepaid
) {
}
