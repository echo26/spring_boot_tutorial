package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.HomeEntity;
import com.example.demo.repository.HomeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HomeServiceImpl implements homeService {

    private final HomeRepository homeRepository;

    @Override
    public Optional<HomeEntity> getById(Long id) {
        return homeRepository.findById(id);
    }

    @Override
    public List<HomeEntity> getAll() {
        return homeRepository.findAll();
    }

    @Override
    public void delete(HomeEntity homeEntity) {
        homeRepository.delete(homeEntity);
    }

    @Override
    public HomeEntity save(HomeEntity homeEntity) {
        if (homeEntity.getId() == null) {
            homeEntity.setCreatedAt(LocalDateTime.now());
        }
        return homeRepository.save(homeEntity);
    }
}
