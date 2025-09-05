package dev.lin.design_patterns_builder.builder;

import dev.lin.design_patterns_builder.model.House;

public class LuxuryHouseBuilder implements HousePlan {
    private House.Builder houseBuilder;

    public LuxuryHouseBuilder() {
        this.houseBuilder = new House.Builder();
    }

    @Override
    public void buildGarage() {
        houseBuilder.withGarage(true);
    }

    @Override
    public void buildGarden() {
        houseBuilder.withGarden(true);
    }

    @Override
    public void buildSwimmingPool() {
        houseBuilder.withSwimmingPool(true);
    }

    @Override
    public void buildDecorativeStatues() {
        houseBuilder.withDecorativeStatues(true);
    }

    @Override
    public House getHouse() {
        return houseBuilder.build();
    }
}
