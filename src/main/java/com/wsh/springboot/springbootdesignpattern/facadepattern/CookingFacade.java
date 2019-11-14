package com.wsh.springboot.springbootdesignpattern.facadepattern;

/**
 * @Description: 烹饪外观类
 * @Author: weixiaohuai
 * @Date: 2019/11/14
 * @Time: 11:35
 */
public class CookingFacade {
    /**
     * 持有各个子对象的引用
     */
    private Bowl bowl;
    private Food food;
    private LampblackMachine lampblackMachine;

    public CookingFacade() {
        this.bowl = Bowl.getInstance();
        this.food = Food.getInstance();
        this.lampblackMachine = LampblackMachine.getInstance();
    }

    /**
     * 准备阶段： 买菜、洗菜、打开油烟机
     */
    public void ready() {
        food.buyFood();
        food.washing();
        lampblackMachine.open();
    }

    /**
     * 烹饪阶段： 煮菜
     */
    public void cooking() {
        food.cooking();
    }

    /**
     * 结束阶段： 关闭油烟机、洗碗
     */
    public void end() {
        lampblackMachine.close();
        bowl.washing();
    }

}
