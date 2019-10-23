package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;

public class Client {
    public static void main(String[] args) {
       ICarFactory bmwCarFactory = new BmwCarFactory();
       bmwCarFactory.createCar().productCar();

        ICarFactory benzCarFactory = new BenzCarFactory();
        benzCarFactory.createCar().productCar();
    }
}
