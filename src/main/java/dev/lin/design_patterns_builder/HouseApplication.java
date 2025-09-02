package dev.lin.design_patterns_builder;

import dev.lin.design_patterns_builder.builder.LuxuryHouseBuilder;
import dev.lin.design_patterns_builder.builder.SimpleHouseBuilder;
import dev.lin.design_patterns_builder.director.HouseDirector;
import dev.lin.design_patterns_builder.model.House;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "dev.lin.design_patterns_builder")
public class HouseApplication {

    public static void main(String[] args) {
        // Arranca el contexto de Spring
        ApplicationContext context = SpringApplication.run(HouseApplication.class, args);

        // Obtener los beans del contexto
        HouseDirector director = context.getBean(HouseDirector.class);
        SimpleHouseBuilder simpleBuilder = context.getBean(SimpleHouseBuilder.class);
        LuxuryHouseBuilder luxuryBuilder = context.getBean(LuxuryHouseBuilder.class);

        // Construir y mostrar la casa simple
        director.constructHouse(simpleBuilder);
        House simpleHouse = simpleBuilder.getHouse();
        System.out.println("Casa Simple: " + simpleHouse);

        // Construir y mostrar la casa de lujo
        director.constructHouse(luxuryBuilder);
        House luxuryHouse = luxuryBuilder.getHouse();
        System.out.println("Casa de Lujo: " + luxuryHouse);
    }
}
