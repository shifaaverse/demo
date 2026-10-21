
package com.example.demo.service;

import com.example.demo.dto.response.MovieResDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieResDto getById(long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie id invalid."));
        return MovieMapper.convertEntityToDto(movie);
    }
}
