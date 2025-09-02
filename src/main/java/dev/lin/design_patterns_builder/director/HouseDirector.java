package dev.lin.design_patterns_builder.director;

import dev.lin.design_patterns_builder.builder.HousePlan;
import dev.lin.design_patterns_builder.model.House;

public class HouseDirector {
    public House constructHouse(HousePlan houseBuilder) {
        houseBuilder.buildGarage();
        houseBuilder.buildGarden();
        houseBuilder.buildSwimmingPool();
        houseBuilder.buildDecorativeStatues();
        return houseBuilder.getHouse();
    }
}
