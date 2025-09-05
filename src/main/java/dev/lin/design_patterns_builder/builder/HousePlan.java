package dev.lin.design_patterns_builder.builder;

import dev.lin.design_patterns_builder.model.House;

public interface HousePlan {
    void buildGarage();
    void buildGarden();
    void buildSwimmingPool();
    void buildDecorativeStatues();
    
    House getHouse();
}
