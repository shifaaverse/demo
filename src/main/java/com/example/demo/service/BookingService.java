
package com.example.demo.service;

import com.example.demo.dto.request.BookingReqDto;
import com.example.demo.mapper.BookingMapper;
import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    public void insert(BookingReqDto bookingReqDto) {
        Booking booking = BookingMapper.convertDtoToEntity(bookingReqDto);
        bookingRepository.save(booking);
    }
}
