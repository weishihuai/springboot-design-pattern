package com.wsh.springboot.springbootdesignpattern.bridgepattern;

/**
 * @Description: 大型号
 * @author: weishihuai
 * @Date: 2019/11/2 15:25
 */
public class LargeGraph implements IGraph {

    @Override
    public void drawGraph() {
        System.out.println("大图形...");
    }
}
