package dev.lin.design_patterns_builder.builder;

import dev.lin.design_patterns_builder.model.House;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class SimpleHouseBuilderTest {

    @Test
    void testGetHouseReturnsSimpleHouse() {
        // Arrange
        SimpleHouseBuilder simpleBuilder = new SimpleHouseBuilder();

        // Act
        simpleBuilder.buildGarage();
        simpleBuilder.buildGarden();
        simpleBuilder.buildSwimmingPool();
        simpleBuilder.buildDecorativeStatues();
        House simpleHouse = simpleBuilder.getHouse();

        // Assert
        assertThat("La casa simple no debe tener garaje", simpleHouse.hasGarage(), is(false));
        assertThat("La casa simple debe tener jardín", simpleHouse.hasGarden(), is(true));
        assertThat("La casa simple no debe tener piscina", simpleHouse.hasSwimmingPool(), is(false));
        assertThat("La casa simple no debe tener estatuas", simpleHouse.hasDecorativeStatues(), is(false));
    }
}
