
package com.example.demo.controller;

import com.example.demo.dto.response.MovieResDto;
import com.example.demo.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/api/movie/{id}")
    public MovieResDto getById(@PathVariable long id) {
        return movieService.getById(id);
    }
}
