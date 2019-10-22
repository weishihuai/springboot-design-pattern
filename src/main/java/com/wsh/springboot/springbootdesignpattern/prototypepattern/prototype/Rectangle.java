package com.wsh.springboot.springbootdesignpattern.prototypepattern.prototype;

/**
 * @Description: 长方形具体原型类（concretePrototype）
 * @author: weishihuai
 * @Date: 2019/10/22 17:58
 */
public class Rectangle extends AbstractShape {

    public Rectangle() {
        setName("长方形");
    }

    @Override
    void draw() {
        System.out.println("绘制长方形...");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
