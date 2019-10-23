package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;

/**
 * @Description: 工厂抽象接口
 * @author: weixiaohuai
 * @Date: 2019/10/19 20:49
 */
public abstract class ICarFactory {

    /**
     * 创建产品方法
     *
     * @return ICar
     */
    abstract ICar createCar();

}
