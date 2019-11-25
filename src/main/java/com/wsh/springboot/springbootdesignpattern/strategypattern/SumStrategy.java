package com.wsh.springboot.springbootdesignpattern.strategypattern;

/**
 * @Description: 求和分数的方法
 * @author: weishihuai
 * @Date: 2019/11/25 17:20
 */
public class SumStrategy implements IStrategy {

    @Override
    public Double calculateScore(Double... score) {
        Double result = 0.0D;
        for (Double s : score) {
            result += s;
        }
        return result;
    }

}
