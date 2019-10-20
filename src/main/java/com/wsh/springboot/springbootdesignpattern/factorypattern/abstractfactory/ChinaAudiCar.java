package com.wsh.springboot.springbootdesignpattern.factorypattern.abstractfactory;

/**
 * @Description: AudiCar国产奥迪汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/20 10:49
 */
public class ChinaAudiCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("【国产】生产奥迪汽车...");
    }
}
