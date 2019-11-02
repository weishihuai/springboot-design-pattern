package com.wsh.springboot.springbootdesignpattern.bridgepattern;

/**
 * @Description: 中型号
 * @author: weishihuai
 * @Date: 2019/11/2 15:25
 */
public class MiddleGraph implements IGraph {

    @Override
    public void drawGraph() {
        System.out.println("中图形...");
    }
}
