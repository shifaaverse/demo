
package com.example.demo.mapper;

import com.example.demo.dto.request.BookingReqDto;
import com.example.demo.dto.response.BookingResDto;
import com.example.demo.model.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {

    public static Booking convertDtoToEntity(BookingReqDto dto){
        Booking booking = new Booking();
        booking.setGuestName(dto.guestName());
        booking.setRoomNumber(dto.roomNumber());
        booking.setNumberOfNights(dto.numberOfNights());
        booking.setPrepaid(dto.isPrepaid());
        return booking;
    }

    public static BookingResDto convertEntityToDto(Booking booking){
        return new BookingResDto(
                booking.getId(),
                booking.getGuestName(),
                booking.getRoomNumber(),
                booking.getNumberOfNights(),
                booking.isPrepaid()
        );
    }
}
