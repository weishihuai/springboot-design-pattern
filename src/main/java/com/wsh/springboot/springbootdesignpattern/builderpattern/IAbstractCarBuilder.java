package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 抽象汽车建造类
 * @author: weixiaohuai
 * @Date: 2019/10/24 14:39
 */
public interface IAbstractCarBuilder {
    /**
     * 冲压工艺
     */
    void stampingProcess();

    /**
     * 焊接工艺
     */
    void weldingProcess();

    /**
     * 涂装工艺
     */
    void paintingProcess();

    /**
     * 检验工艺
     */
    void inspectionProcess();

    /**
     * 构建汽车方法
     *
     * @return Car
     */
    Car buildCar();

}
