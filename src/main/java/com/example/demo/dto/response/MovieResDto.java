
package com.example.demo.dto.response;

public record MovieResDto(
        Long id,
        String title,
        String genre,
        int runtimeMinutes,
        boolean isPremium
) {
}
