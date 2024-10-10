package com.example.kiosk.store.config;

import com.example.kiosk.store.service.StoreService;
import com.example.kiosk.store.service.StoreServiceImpl;
import org.springframework.context.annotation.Bean;

public class StoreConfig {

    @Bean
    public StoreService storeService() {
        return new StoreServiceImpl();
    }
}
