package com.wsh.springboot.springbootdesignpattern.factorypattern.abstractfactory;

/**
 * @Description: 国产汽车工厂实现类
 * @author: weixiaohuai
 * @Date: 2019/10/20 10:49
 */
public class ChinaCarFactory implements ICarAbstractFactory {

    @Override
    public ICar productCar(CarTypeEnum carTypeEnum) {
        ICar car;
        switch (carTypeEnum) {
            case AUDI:
                car = new ChinaAudiCar();
                car.productCar();
                break;
            case BMW:
                car = new ChinaBmwCar();
                car.productCar();
                break;
            default:
                return null;
        }
        return car;
    }
}
