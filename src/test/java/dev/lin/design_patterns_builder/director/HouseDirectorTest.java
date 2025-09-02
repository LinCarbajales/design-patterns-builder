package dev.lin.design_patterns_builder.director;

import dev.lin.design_patterns_builder.builder.HousePlan;
import dev.lin.design_patterns_builder.model.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


class HouseDirectorTest {

    @Mock
    private HousePlan housePlanMock;

    @InjectMocks
    private HouseDirector houseDirector;

    @Mock
    private House houseMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConstructHouse() {

        when(housePlanMock.getHouse()).thenReturn(houseMock);

        House constructedHouse = houseDirector.constructHouse(housePlanMock);

        verify(housePlanMock).buildGarage();
        verify(housePlanMock).buildGarden();
        verify(housePlanMock).buildSwimmingPool();
        verify(housePlanMock).buildDecorativeStatues();

        assertThat(constructedHouse, is(houseMock));
    }
}
