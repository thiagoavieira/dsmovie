package com.thiagoavieira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoavieira.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
