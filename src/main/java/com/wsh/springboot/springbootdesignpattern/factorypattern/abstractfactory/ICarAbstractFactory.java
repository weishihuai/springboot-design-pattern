package com.wsh.springboot.springbootdesignpattern.factorypattern.abstractfactory;

/**
 * @Description: 工厂抽象接口
 * @author: weixiaohuai
 * @Date: 2019/10/20 10:49
 */
public interface ICarAbstractFactory {

    ICar productCar(CarTypeEnum carTypeEnum);

}
