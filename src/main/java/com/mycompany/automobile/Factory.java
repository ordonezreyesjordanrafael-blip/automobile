package com.mycompany.automobile;

public class Factory {

    public static void main(String[] args) {
    Car auto = new Car();

    auto.setBrand("toyota");
    auto.setCarType(CarType.CITY_CAR);
    auto.setColor(Color.YELLOW);
    auto.setCurrentSpeed(12.5f);
    auto.setEngine(0.4);
    auto.setFuelType(FlueType.GASOLINE);
    auto.setMaximumSpeed(15.8f);
    auto.setModel("ford");
    auto.setnOfDoors(14);
    auto.setnOfSeats(1);
    
        System.out.println("Velocidad inicial: " + auto.getCurrentSpeed()+ " km/h");
        System.out.println("Despues de acelerar 20 km/h: " + auto.getCurrentSpeed() + " km/h");
        System.out.println("Despues de desacelerar 50 km/h: " + auto.getCurrentSpeed() + " km/h");
        System.out.println("Despues de frenar: " +auto.getCurrentSpeed() + " km/h");
        System.out.println("Tiempo estimado para 240 km a 80 km/h: "+ auto.calculateEstimatedTime(240) + " horas");
        System.out.println("--- Datos del automovil ---");
        auto.print();
    }
         
    }
