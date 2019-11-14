package com.wsh.springboot.springbootdesignpattern.facadepattern;

/**
 * @Description: 食物类
 * @Author: weixiaohuai
 * @Date: 2019/11/14
 * @Time: 11:26
 */
public class Food {

    private static volatile Food food;

    private Food() {
    }

    public static Food getInstance() {
        if (null == food) {
            synchronized (Food.class) {
                if (null == food) {
                    food = new Food();
                }
            }
        }
        return food;
    }

    public void buyFood() {
        System.out.println("购买食物...");
    }

    public void washing() {
        System.out.println("清洗食物...");
    }

    public void cooking() {
        System.out.println("烹饪食物...");
    }

}
