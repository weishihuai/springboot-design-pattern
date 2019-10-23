package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;


/**
 * @Description: BenzCar奔驰汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/19 20:49
 */
public class BenzCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("生产奔驰汽车...");
    }
}
