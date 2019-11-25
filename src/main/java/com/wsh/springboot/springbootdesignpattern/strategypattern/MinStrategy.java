package com.wsh.springboot.springbootdesignpattern.strategypattern;

import java.util.Arrays;

/**
 * @Description: 求最小分数
 * @author: weishihuai
 * @Date: 2019/11/25 17:20
 */
public class MinStrategy implements IStrategy {

    @Override
    public Double calculateScore(Double... score) {
        Arrays.sort(score);
        return score[0];
    }

}
