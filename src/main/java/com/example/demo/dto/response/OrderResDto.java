package com.example.demo.dto.response;

public record OrderResDto(

        Long id,
        String customerName,
        String restaurantName,
        int totalPrice,
        boolean isDelivered
) {
}
