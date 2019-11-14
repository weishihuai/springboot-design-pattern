package com.wsh.springboot.springbootdesignpattern.facadepattern;

/**
 * @Description: 抽油烟机
 * @Author: weixiaohuai
 * @Date: 2019/11/14
 * @Time: 11:26
 */
public class LampblackMachine {

    private static volatile LampblackMachine lampblackMachine;

    private LampblackMachine() {
    }

    public static LampblackMachine getInstance() {
        if (null == lampblackMachine) {
            synchronized (LampblackMachine.class) {
                if (null == lampblackMachine) {
                    lampblackMachine = new LampblackMachine();
                }
            }
        }
        return lampblackMachine;
    }

    public void open() {
        System.out.println("打开抽油烟机...");
    }

    public void close() {
        System.out.println("关闭抽油烟机...");
    }

}
