package com.wsh.springboot.springbootdesignpattern.factorypattern.simplefactory;

/**
 * @Description: 简单工厂类，根据汽车类型生产不同品牌的汽车供客户端使用
 * @author: weixiaohuai
 * @Date: 2019/10/19 14:49
 * <p>
 * 说明：客户端不需要知道具体生产汽车的逻辑，只管使用汽车就行，简单工厂模式将创建对象的操作统一封装在工厂类中，
 * 减少了客户端对汽车的具体依赖，从某种程度上有利于松耦合。
 */
public class ICarSimpleFactory {
    /**
     * 根据汽车类型返回具体的汽车
     *
     * @param carTypeEnum 汽车类型
     * @return 汽车
     */
    public static ICar productCarByCarType(CarTypeEnum carTypeEnum) {
        ICar iCar = null;
        switch (carTypeEnum) {
            case BENZ:
                iCar = new BenzCar();
                break;
            case BMW:
                iCar = new BmwCar();
                break;
            case AUDI:
                iCar = new AudiCar();
                break;
            default:
                break;
        }
        return iCar;
    }
}

/**
 * 汽车类型枚举类
 */
enum CarTypeEnum {
    BMW, BENZ, AUDI
}