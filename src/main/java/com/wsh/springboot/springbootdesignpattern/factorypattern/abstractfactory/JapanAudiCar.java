package com.wsh.springboot.springbootdesignpattern.factorypattern.abstractfactory;

/**
 * @Description: AudiCar日产奥迪汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/20 10:49
 */
public class JapanAudiCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("【日产】生产奥迪汽车...");
    }
}
