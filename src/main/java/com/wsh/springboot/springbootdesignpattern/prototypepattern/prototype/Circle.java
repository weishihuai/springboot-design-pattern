package com.wsh.springboot.springbootdesignpattern.prototypepattern.prototype;

/**
 * @Description: 圆形具体原型类（concretePrototype）
 * @author: weishihuai
 * @Date: 2019/10/22 17:58
 */
public class Circle extends AbstractShape {

    public Circle() {
        setName("圆形");
    }

    @Override
    void draw() {
        System.out.println("绘制圆形...");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
