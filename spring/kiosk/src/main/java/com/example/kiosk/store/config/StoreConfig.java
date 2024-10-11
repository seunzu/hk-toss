package com.example.kiosk.store.config;

import com.example.kiosk.store.service.StoreService;
import com.example.kiosk.store.service.StoreServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

public class StoreConfig {

    @Bean
    @ConditionalOnMissingBean
    public StoreService storeService() {
        return new StoreServiceImpl();
    }
}
