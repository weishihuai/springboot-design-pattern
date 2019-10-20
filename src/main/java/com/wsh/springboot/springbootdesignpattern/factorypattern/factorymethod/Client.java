package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;

public class Client {
    public static void main(String[] args) {
        JapanCarFactory japanCarFactory = new JapanCarFactory();
        japanCarFactory.createFactory(CarTypeEnum.BMW);

        ChinaCarFactory chinaCarFactory = new ChinaCarFactory();
        chinaCarFactory.createFactory(CarTypeEnum.AUDI);
    }
}
