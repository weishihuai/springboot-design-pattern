package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 普通汽车构造类
 * @author: weixiaohuai
 * @Date: 2019/10/24 14:45
 */
public class OrdinaryCarBuilder implements IAbstractCarBuilder {

    private Car car = new Car();

    @Override
    public void stampingProcess() {
        System.out.println("普通汽车 --> 冲压工艺");
        car.setStampingMaterial(new StampingMaterial("普通汽车冲压材料"));
    }

    @Override
    public void weldingProcess() {
        System.out.println("普通汽车 --> 焊接工艺");
        car.setWeldingMaterial(new WeldingMaterial("普通汽车焊接材料"));
    }

    @Override
    public void paintingProcess() {
        System.out.println("普通汽车 --> 涂装工艺");
        car.setPaintingMaterial(new PaintingMaterial("普通汽车涂装材料"));
    }

    @Override
    public void inspectionProcess() {
        System.out.println("普通汽车 --> 检验工艺");
        car.setInspectionMaterial(new InspectionMaterial("普通汽车检验材料"));
    }

    @Override
    public Car buildCar() {
        return car;
    }
}
