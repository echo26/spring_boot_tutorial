package com.example.demo.config;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.HomeEntity;
import com.example.demo.service.homeService;

@Component
public class initialDataConfig implements CommandLineRunner {

    @Autowired
    private homeService homeService;

    @Override
    public void run (String... args) throws Exception {

        List<HomeEntity> homes = homeService.getAll();
        if (homes.size()==0){
            HomeEntity homeEntity1 = new HomeEntity();
            homeEntity1.setName("eddy");
            homeEntity1.setCreatedAt(LocalDateTime.now());
            homeService.save(homeEntity1);

            HomeEntity homeEntity2 = new HomeEntity();
            homeEntity2.setName("julia");
            homeEntity2.setCreatedAt(LocalDateTime.now());
            homeService.save(homeEntity2);
        }

    }
}