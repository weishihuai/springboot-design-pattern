package com.wsh.springboot.springbootdesignpattern.prototypepattern.prototype;

/**
 * @Description: 抽象原型类（prototype）
 * @author: weishihuai
 * @Date: 2019/10/22 17:57
 */
public abstract class AbstractShape implements Cloneable {

    /**
     * 绘制图形方法
     */
    abstract void draw();

    /**
     * 名称
     */
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "name='" + name + '\'' +
                '}';
    }
}
