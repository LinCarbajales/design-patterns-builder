package dev.lin.design_patterns_builder.config;

import dev.lin.design_patterns_builder.builder.LuxuryHouseBuilder;
import dev.lin.design_patterns_builder.builder.SimpleHouseBuilder;
import dev.lin.design_patterns_builder.director.HouseDirector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SimpleHouseBuilder simpleHouseBuilder() {
        return new SimpleHouseBuilder();
    }

    @Bean
    public LuxuryHouseBuilder luxuryHouseBuilder() {
        return new LuxuryHouseBuilder();
    }

    @Bean
    public HouseDirector houseDirector() {
        return new HouseDirector();
    }
}
