package com.example.kiosk.config;

import com.example.kiosk.service.kiosk.GetStoreService;
import com.example.kiosk.service.kiosk.KioskService;
import com.example.kiosk.service.kiosk.KioskServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KioskConfig {

    @Bean
    @ConditionalOnMissingBean
    public KioskService kioskService(GetStoreService getStoreService) {
        return new KioskServiceImpl(getStoreService);
    }
}
