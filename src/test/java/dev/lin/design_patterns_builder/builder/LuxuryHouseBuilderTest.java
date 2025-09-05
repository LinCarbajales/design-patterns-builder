package dev.lin.design_patterns_builder.builder;

import dev.lin.design_patterns_builder.model.House;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class LuxuryHouseBuilderTest {

    @Test
    void testGetHouseReturnsLuxuryHouse() {
        // Arrange
        LuxuryHouseBuilder luxuryBuilder = new LuxuryHouseBuilder();

        // Act
        luxuryBuilder.buildGarage();
        luxuryBuilder.buildGarden();
        luxuryBuilder.buildSwimmingPool();
        luxuryBuilder.buildDecorativeStatues();
        House luxuryHouse = luxuryBuilder.getHouse();

        // Assert
        assertThat("La casa de lujo debe tener garaje", luxuryHouse.hasGarage(), is(true));
        assertThat("La casa de lujo debe tener jardín", luxuryHouse.hasGarden(), is(true));
        assertThat("La casa de lujo debe tener piscina", luxuryHouse.hasSwimmingPool(), is(true));
        assertThat("La casa de lujo debe tener estatuas", luxuryHouse.hasDecorativeStatues(), is(true));
    }
}