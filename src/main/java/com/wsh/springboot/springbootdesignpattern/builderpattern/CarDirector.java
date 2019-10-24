package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 汽车建造监工类
 * @author: weixiaohuai
 * @Date: 2019/10/24 14:47
 */
public class CarDirector {

    private IAbstractCarBuilder carAbstractBuilder;

    public void setCarAbstractBuilder(IAbstractCarBuilder carAbstractBuilder) {
        this.carAbstractBuilder = carAbstractBuilder;
    }

    public Car build() {
        carAbstractBuilder.stampingProcess();
        carAbstractBuilder.weldingProcess();
        carAbstractBuilder.paintingProcess();
        carAbstractBuilder.inspectionProcess();
        return carAbstractBuilder.buildCar();
    }

}
