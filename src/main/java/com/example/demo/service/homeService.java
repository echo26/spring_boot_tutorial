package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.HomeEntity;

public interface homeService {
    Optional<HomeEntity> getById(Long id);
    List<HomeEntity> getAll();
    void delete(HomeEntity homeEntity);
    HomeEntity save(HomeEntity homeEntity);
}
