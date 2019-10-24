package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 焊接材料
 * @author: weishihuai
 * @Date: 2019/10/24 15:39
 */
public class WeldingMaterial {
    private String name;

    public WeldingMaterial(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeldingMaterial{" +
                "name='" + name + '\'' +
                '}';
    }
}
