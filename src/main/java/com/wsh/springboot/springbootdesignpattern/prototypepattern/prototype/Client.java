package com.wsh.springboot.springbootdesignpattern.prototypepattern.prototype;

/**
 * @Description: 客户类（Client）
 * @author: weishihuai
 * @Date: 2019/10/22 18:01
 */
public class Client {
    public static void main(String[] args) {
        AbstractShape rectangle = new Rectangle();
        System.out.println(rectangle + ">>>>>>" + rectangle.hashCode());
        Rectangle cloneRectangle = (Rectangle) rectangle.clone();
        System.out.println(cloneRectangle + ">>>>>>" + cloneRectangle.hashCode());
        Rectangle cloneRectangle2 = (Rectangle) rectangle.clone();
        System.out.println(cloneRectangle2 + ">>>>>>" + cloneRectangle2.hashCode());
    }
}
