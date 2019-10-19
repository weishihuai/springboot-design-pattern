package com.wsh.springboot.springbootdesignpattern.factorypattern.simplefactory;

/**
 * @Description: BmwCar宝马汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/19 14:49
 */
public class BmwCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("生产宝马汽车...");
    }
}
