# Builder Pattern - House Construction

Este proyecto implementa el patrón Builder para la construcción de diferentes tipos de casas en Java.

## Diagrama de Clases

```mermaid
classDiagram
    class HousePlan {
        <<interface>>
        +buildGarage() void
        +buildGarden() void
        +buildSwimmingPool() void
        +buildDecorativeStatues() void
        +getHouse() House
    }

    class House {
        -garage boolean
        -garden boolean
        -swimmingPool boolean
        -decorativeStatues boolean
        -House(builder Builder)
        +hasGarage() boolean
        +hasGarden() boolean
        +hasSwimmingPool() boolean
        +hasDecorativeStatues() boolean
        +toString() String
    }

    class Builder {
        -garage boolean
        -garden boolean
        -swimmingPool boolean
        -decorativeStatues boolean
        +Builder()
        +withGarage(garage boolean) Builder
        +withGarden(garden boolean) Builder
        +withSwimmingPool(swimmingPool boolean) Builder
        +withDecorativeStatues(decorativeStatues boolean) Builder
        +build() House
    }

    class LuxuryHouseBuilder {
        -houseBuilder Builder
        +LuxuryHouseBuilder()
        +buildGarage() void
        +buildGarden() void
        +buildSwimmingPool() void
        +buildDecorativeStatues() void
        +getHouse() House
    }

    class SimpleHouseBuilder {
        -houseBuilder Builder
        +SimpleHouseBuilder()
        +buildGarage() void
        +buildGarden() void
        +buildSwimmingPool() void
        +buildDecorativeStatues() void
        +getHouse() House
    }

    class HouseDirector {
        +constructHouse(houseBuilder HousePlan) House
    }

    HousePlan <|.. LuxuryHouseBuilder
    HousePlan <|.. SimpleHouseBuilder
    House *-- Builder
    LuxuryHouseBuilder --> Builder
    SimpleHouseBuilder --> Builder
    HouseDirector --> HousePlan
    HouseDirector ..> House
    Builder ..> House
```

## Descripción

El patrón Builder permite construir objetos complejos paso a paso. En este ejemplo:

- **HousePlan**: Interfaz que define los pasos para construir una casa
- **LuxuryHouseBuilder**: Construye casas de lujo con todas las características
- **SimpleHouseBuilder**: Construye casas simples con características básicas
- **HouseDirector**: Dirige el proceso de construcción
- **House**: El producto final con su Builder interno

## Uso

```java
// Construcción dirigida
HouseDirector director = new HouseDirector();
House luxuryHouse = director.constructHouse(new LuxuryHouseBuilder());
House simpleHouse = director.constructHouse(new SimpleHouseBuilder());

// Construcción directa
House customHouse = new House.Builder()
    .withGarage(true)
    .withGarden(true)
    .withSwimmingPool(false)
    .withDecorativeStatues(false)
    .build();
```

## Tests

Muestra de la cobertura de tests de 83,18%

<img width="193" height="209" alt="image" src="https://github.com/user-attachments/assets/b59ba44b-e334-4318-a9cc-639ee8b814c3" />
