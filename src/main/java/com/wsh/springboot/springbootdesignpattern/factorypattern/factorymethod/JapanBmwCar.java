package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;

/**
 * @Description: ChinaBmwCar日产宝马汽车类
 * @author: weixiaohuai
 * @Date: 2019/10/19 20:49
 */
public class JapanBmwCar implements ICar {
    @Override
    public void productCar() {
        System.out.println("【日产】生产宝马汽车...");
    }
}
