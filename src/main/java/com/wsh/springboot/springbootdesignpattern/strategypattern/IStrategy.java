package com.wsh.springboot.springbootdesignpattern.strategypattern;

/**
 * @Description: 抽象策略接口
 * @author: weishihuai
 * @Date: 2019/11/25 17:19
 */
public interface IStrategy {
    /**
     * 计算分数的方法
     *
     * @param score 分数
     * @return 分数
     */
    Double calculateScore(Double... score);

}
