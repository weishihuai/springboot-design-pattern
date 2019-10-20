package com.wsh.springboot.springbootdesignpattern.factorypattern.abstractfactory;

public class Client {
    public static void main(String[] args) {
        ICarAbstractFactory japanCarFactory = new JapanCarFactory();
        japanCarFactory.productCar(CarTypeEnum.BMW);

        ICarAbstractFactory chinaCarFactory = new ChinaCarFactory();
        chinaCarFactory.productCar(CarTypeEnum.AUDI);
    }
}
