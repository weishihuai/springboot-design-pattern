package com.wsh.springboot.springbootdesignpattern.factorypattern.simplefactory;

public class Client {
    public static void main(String[] args) {
        ICar benzCar = ICarSimpleFactory.productCarByCarType(CarTypeEnum.BENZ);
        ICar audiCar = ICarSimpleFactory.productCarByCarType(CarTypeEnum.AUDI);
        benzCar.productCar();
        audiCar.productCar();
    }
}
