package com.example.test.dao;

import com.example.test.pojo.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    public List<MovieEntity> findMovieEntitiesByType(String type);
}