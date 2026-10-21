package com.example.demo.service;

import com.example.demo.dto.request.OrderReqDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void update(long id, OrderReqDto orderReqDto){
        Order order = orderRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("order id is not found"));

        order.setCustomerName(orderReqDto.CustomerName());
        order.setRestaurantName(orderReqDto.RestaurantName());
        order.setTotalPrice(orderReqDto.totalPrice());
        order.setDelivered(orderReqDto.isDelivered());

        orderRepository.save(order);
    }
}
