
package com.mycompany.automobile;

public class Car {
        private String brand;
        private String model;
        private double engine;
        private FlueType fuelType;
        private CarType carType;
        private int nOfDoors;
        private int nOfSeats;
        private float maximumSpeed;
        private Color color;
        private double currentSpeed;

    public Car() {
    }

         
    public Car(String brand, String model, double engine, FlueType fuelType, CarType carType, int nOfDoors, int nOfSeats, float maximumSpeed, Color color, double currentSpeed) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.nOfDoors = nOfDoors;
        this.nOfSeats = nOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public FlueType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FlueType fuelType) {
        this.fuelType = fuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getnOfDoors() {
        return nOfDoors;
    }

    public void setnOfDoors(int nOfDoors) {
        this.nOfDoors = nOfDoors;
    }

    public int getnOfSeats() {
        return nOfSeats;
    }

    public void setnOfSeats(int nOfSeats) {
        this.nOfSeats = nOfSeats;
    }

    public float getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(float maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
         
          public void accelerate(int speedIncrease) {
        if (currentSpeed + speedIncrease > maximumSpeed) {
            System.out.println("No se puede acelerar mas alla de la velocidad maxima ("
                    + maximumSpeed + " km/h).");
        } else {
            currentSpeed = speedIncrease;
        }
    }

    public void decelerate(int speedDecrease) {
        if (currentSpeed - speedDecrease < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } else {
            currentSpeed = speedDecrease;
        }
    }

    public void brake() {
        currentSpeed = 0;
    }

    public double calculateEstimatedTime(int distance) {
        if (currentSpeed == 0) {
            System.out.println("El automovil esta detenido, no se puede calcular el tiempo.");
            return 0;
        }
        return distance / currentSpeed;
    }

    public void print() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo (año): " + model);
        System.out.println("Motor: " + engine + " L");
        System.out.println("Combustible: " + fuelType);
        System.out.println("Tipo de auto: " + carType);
        System.out.println("Numero de puertas: " + nOfDoors);
        System.out.println("Numero de asientos: " + nOfSeats);
        System.out.println("Velocidad maxima: " + maximumSpeed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + currentSpeed + " km/h");
    }
}
