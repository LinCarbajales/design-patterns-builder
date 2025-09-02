package dev.lin.design_patterns_builder.model;

public class House {
    private final boolean garage;
    private final boolean garden;
    private final boolean swimmingPool;
    private final boolean decorativeStatues;

    private House(Builder builder) {
        this.garage = builder.garage;
        this.garden = builder.garden;
        this.swimmingPool = builder.swimmingPool;
        this.decorativeStatues = builder.decorativeStatues;
    }

    // Getters
    public boolean hasGarage() { return garage; }
    public boolean hasGarden() { return garden; }
    public boolean hasSwimmingPool() { return swimmingPool; }
    public boolean hasDecorativeStatues() { return decorativeStatues; }

    @Override
    public String toString() {
        return "House{" +
               "garage=" + garage +
               ", garden=" + garden +
               ", swimmingPool=" + swimmingPool +
               ", decorativeStatues=" + decorativeStatues +
               '}';
    }

    public static class Builder {
        private boolean garage = false;
        private boolean garden = false;
        private boolean swimmingPool = false;
        private boolean decorativeStatues = false;

        public Builder() {}

        public Builder withGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        public Builder withGarden(boolean garden) {
            this.garden = garden;
            return this;
        }

        public Builder withSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }

        public Builder withDecorativeStatues(boolean decorativeStatues) {
            this.decorativeStatues = decorativeStatues;
            return this;
        }

        
        public House build() {
            return new House(this);
        }
    }
}
