package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 客户端类
 * @author: weixiaohuai
 * @Date: 2019/10/24 14:49
 */
public class Client {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        carDirector.setCarAbstractBuilder(new OrdinaryCarBuilder());
        Car car = carDirector.build();
        System.out.println(car);

        System.out.println("=================================================================================================");

        //同样的构建过程可以创建不同的表示
        carDirector.setCarAbstractBuilder(new LuxuryCarBuilder());
        Car car2 = carDirector.build();
        System.out.println(car2);
    }
}
