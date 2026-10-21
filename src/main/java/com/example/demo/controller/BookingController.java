
package com.example.demo.controller;

import com.example.demo.dto.request.BookingReqDto;
import com.example.demo.service.BookingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("/api/booking/add")
    public void insert(@Valid @RequestBody BookingReqDto bookingReqDto) {
        bookingService.insert(bookingReqDto);
    }
}
