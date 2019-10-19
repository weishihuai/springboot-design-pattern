package com.wsh.springboot.springbootdesignpattern.factorypattern.simplefactory;

/**
 * @Description: BenzCar奔驰汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/19 14:49
 */
public class BenzCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("生产奔驰汽车...");
    }
}
