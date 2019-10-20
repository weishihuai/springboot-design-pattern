package com.wsh.springboot.springbootdesignpattern.factorypattern.abstractfactory;

/**
 * @Description: 日产汽车工厂实现类
 * @author: weixiaohuai
 * @Date: 2019/10/20 10:49
 */
public class JapanCarFactory implements ICarAbstractFactory {

    @Override
    public ICar productCar(CarTypeEnum carTypeEnum) {
        ICar car;
        switch (carTypeEnum) {
            case AUDI:
                car = new JapanAudiCar();
                car.productCar();
                break;
            case BMW:
                car = new JapanBmwCar();
                car.productCar();
                break;
            default:
                return null;
        }
        return car;
    }
}
