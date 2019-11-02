package com.wsh.springboot.springbootdesignpattern.bridgepattern;

/**
 * @Description: 小型号
 * @author: weishihuai
 * @Date: 2019/11/2 15:25
 */
public class SmallGraph implements IGraph {

    @Override
    public void drawGraph() {
        System.out.println("小图形...");
    }
}
