package com.wsh.springboot.springbootdesignpattern.bridgepattern;

/**
 * @Description: 长方形
 * @author: weishihuai
 * @Date: 2019/11/2 15:27
 */
public class RectangleGraph extends AbstractGraph {
    @Override
    public  void paintGraph() {
        this.graph.drawGraph();
        System.out.println("绘制长方形...");
    }
}
