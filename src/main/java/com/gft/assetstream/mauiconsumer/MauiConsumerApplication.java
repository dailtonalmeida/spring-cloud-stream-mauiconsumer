package com.gft.assetstream.mauiconsumer;

import com.gft.assetstream.mauiconsumer.business.domain.Asset;
import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class MauiConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MauiConsumerApplication.class, args);
    }

    @Bean
    public Consumer<Asset> consumeAsset() {
        return (Asset asset) -> {
            log.info("MAUI accepting asset {}", asset);
        };
    }

}
