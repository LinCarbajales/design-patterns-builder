package dev.lin.design_patterns_builder.builder;

import dev.lin.design_patterns_builder.model.House;

public class SimpleHouseBuilder implements HousePlan {
    private House.Builder houseBuilder;

    public SimpleHouseBuilder() {
        this.houseBuilder = new House.Builder();
    }

    @Override
    public void buildGarage() {
        houseBuilder.withGarage(false);
    }

    @Override
    public void buildGarden() {
        houseBuilder.withGarden(true);
    }

    @Override
    public void buildSwimmingPool() {
        houseBuilder.withSwimmingPool(false);
    }

    @Override
    public void buildDecorativeStatues() {
        houseBuilder.withDecorativeStatues(false);
    }

    @Override
    public House getHouse() {
        return houseBuilder.build();
    }
}
