package com.wsh.springboot.springbootdesignpattern.bridgepattern;

/**
 * @Description: 型号大小抽象类
 * @author: weishihuai
 * @Date: 2019/11/2 14:46
 */
public abstract class AbstractGraph {

    protected IGraph graph;

    public void setGraph(IGraph graph) {
        this.graph = graph;
    }

    /**
     * 绘制图形
     */
    public abstract void paintGraph();

}
