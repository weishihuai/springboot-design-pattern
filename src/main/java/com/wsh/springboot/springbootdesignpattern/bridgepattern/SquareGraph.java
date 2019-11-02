package com.wsh.springboot.springbootdesignpattern.bridgepattern;

/**
 * @Description: 正方形类
 * @author: weishihuai
 * @Date: 2019/11/2 15:25
 */
public class SquareGraph extends AbstractGraph {

    @Override
    public void paintGraph() {
        this.graph.drawGraph();
        System.out.println("绘制正方形...");
    }
}