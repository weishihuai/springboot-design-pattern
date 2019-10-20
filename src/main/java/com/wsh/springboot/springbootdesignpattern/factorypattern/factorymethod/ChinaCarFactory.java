package com.wsh.springboot.springbootdesignpattern.factorypattern.factorymethod;

/**
 * @Description: 国产汽车工厂类
 * @author: weixiaohuai
 * @Date: 2019/10/19 20:49
 */
public class ChinaCarFactory extends ICarFactory {

    ICar createFactory(CarTypeEnum carTypeEnum) {
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
