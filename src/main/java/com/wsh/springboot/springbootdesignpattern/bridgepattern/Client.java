package com.wsh.springboot.springbootdesignpattern.bridgepattern;

/**
 * @Description: 客户端使用类
 * @author: weishihuai
 * @Date: 2019/11/2 14:55
 */
public class Client {
    public static void main(String[] args) {
        IGraph middleGraph = new MiddleGraph();
        AbstractGraph graph = new RectangleGraph();
        graph.setGraph(middleGraph);
        graph.paintGraph();
    }
}
