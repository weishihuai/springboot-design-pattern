package com.wsh.springboot.springbootdesignpattern.strategypattern;

/**
 * @Description: 上下文对象
 * @author: weishihuai
 * @Date: 2019/11/25 17:32
 */
public class Context {
    /**
     * 持有抽象测评角色引用
     */
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Double calculateScore(Double... score) {
        return strategy.calculateScore(score);
    }

}
