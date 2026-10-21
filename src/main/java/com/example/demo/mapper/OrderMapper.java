package com.example.demo.mapper;

import com.example.demo.dto.request.OrderReqDto;
import com.example.demo.dto.response.OrderResDto;
import com.example.demo.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public static Order convertDtoToEntity(OrderReqDto dto){

        Order order = new Order();
        order.setCustomerName(dto.CustomerName());
        order.setRestaurantName(dto.RestaurantName());
        order.setTotalPrice(dto.totalPrice());
        order.setDelivered(dto.isDelivered());
        return order;
    }

    public static OrderResDto convertEntityToDto(Order order){
        return new OrderResDto(
                order.getId(),
                order.getCustomerName(),
                order.getRestaurantName(),
                order.getTotalPrice(),
                order.isDelivered()
        );
    }
}
