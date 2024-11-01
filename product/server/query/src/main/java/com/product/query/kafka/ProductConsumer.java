package com.product.query.kafka;

import com.product.query.kafka.dto.KafkaProductMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductConsumer {

    private final KafkaProductService service;

    @KafkaListener(topics = "pro.SAVE")
    public void saveConsumer(KafkaProductMessage msg) {
        if (msg.action().equals("save"))
            service.save(msg.message());
        if (msg.action().equals("sell"))
            service.sell(msg.message().getId());
        if (msg.action().equals("receive"))
            service.receive(msg.message().getId());
    }


}
