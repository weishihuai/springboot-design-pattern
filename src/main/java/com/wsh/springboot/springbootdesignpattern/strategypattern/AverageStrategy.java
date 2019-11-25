package com.wsh.springboot.springbootdesignpattern.strategypattern;

/**
 * @Description: 求平均值分数
 * @author: weishihuai
 * @Date: 2019/11/25 17:20
 */
public class AverageStrategy implements IStrategy {

    @Override
    public Double calculateScore(Double... score) {
        Double result = 0.0D;
        for (Double s : score) {
            result += s;
        }
        return result / score.length;
    }
}
