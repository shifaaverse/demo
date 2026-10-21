
package com.example.demo.mapper;

import com.example.demo.dto.request.MovieReqDto;
import com.example.demo.dto.response.MovieResDto;
import com.example.demo.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public static Movie convertDtoToEntity(MovieReqDto dto){
        Movie movie = new Movie();
        movie.setTitle(dto.title());
        movie.setGenre(dto.genre());
        movie.setRuntimeMinutes(dto.runtimeMinutes());
        movie.setPremium(dto.isPremium());
        return movie;
    }

    public static MovieResDto convertEntityToDto(Movie movie){
        return new MovieResDto(
                movie.getId(),
                movie.getTitle(),
                movie.getGenre(),
                movie.getRuntimeMinutes(),
                movie.isPremium()
        );
    }
}
