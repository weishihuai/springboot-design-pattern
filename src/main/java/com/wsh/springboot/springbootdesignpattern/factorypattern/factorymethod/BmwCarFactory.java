package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;

/**
 * @Description:
 * @author: weishihuai
 * @Date: 2019/10/19 20:49
 */
public class BmwCarFactory extends ICarFactory {

    @Override
    ICar createCar() {
        return new BmwCar();
    }
}
