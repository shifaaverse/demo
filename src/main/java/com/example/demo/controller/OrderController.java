package com.example.demo.controller;

import com.example.demo.dto.request.OrderReqDto;
import com.example.demo.service.OrderService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PutMapping("/api/order/{id}")
    public void update(@PathVariable long id,
                       @Valid @RequestBody OrderReqDto orderReqDto){
        orderService.update(id, orderReqDto);
    }
}
