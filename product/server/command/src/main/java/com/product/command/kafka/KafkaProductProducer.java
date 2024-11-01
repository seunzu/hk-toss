package com.product.command.kafka;

import com.product.command.entity.Product;
import com.product.command.kafka.dto.KafkaProductMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class KafkaProductProducer implements KafkaProductService {

    private final KafkaTemplate<String, KafkaProductMessage> kafkaTemplate;
    private static final String topic = "pro";

    @Override
    public void receive(Long productId) {
        Product product = new Product(productId, null, null, null);
        KafkaProductMessage message = new KafkaProductMessage(LocalDateTime.now(), product, "receive");
        kafkaTemplate.send(topic, message);

    }

    @Override
    public void sell(Long productId) {
        Product product = new Product(productId, null, null, null);
        KafkaProductMessage message = new KafkaProductMessage(
                LocalDateTime.now(), product, "sell");
        kafkaTemplate.send(topic, message);
    }

    @Override
    public void save(Product product) {
        KafkaProductMessage message = new KafkaProductMessage(LocalDateTime.now(), product, "save");
        kafkaTemplate.send(topic, message);
    }
}
