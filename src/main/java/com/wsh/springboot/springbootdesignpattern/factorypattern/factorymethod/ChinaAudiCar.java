package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;

/**
 * @Description: AudiCar国产奥迪汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/19 20:49
 */
public class ChinaAudiCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("【国产】生产奥迪汽车...");
    }
}
