package com.wsh.springboot.springbootdesignpattern.factorypattern.simplefactory;

/**
 * @Description: AudiCar奥迪汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/19 14:49
 */
public class AudiCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("生产奥迪汽车...");
    }
}
