package com.wsh.springboot.springbootdesignpattern.factorypattern.abstractfactory;

/**
 * @Description: ChinaBmwCar国产宝马汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/20 10:49
 */
public class ChinaBmwCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("【国产】生产宝马汽车...");
    }
}
