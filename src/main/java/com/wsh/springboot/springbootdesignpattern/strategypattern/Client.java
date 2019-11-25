package com.wsh.springboot.springbootdesignpattern.strategypattern;

/**
 * @Description: 客户端
 * @author: weishihuai
 * @Date: 2019/11/25 17:34
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new SumStrategy());
        Double sumScore = context.calculateScore(1D, 4D, 2D, 3D);
        System.out.println("sumScore = " + sumScore);

        context.setStrategy(new AverageStrategy());
        Double averageScore = context.calculateScore(1D, 4D, 2D, 3D);
        System.out.println("averageScore = " + averageScore);

        context.setStrategy(new MaxStrategy());
        Double maxScore = context.calculateScore(1D, 4D, 2D, 3D);
        System.out.println("maxScore = " + maxScore);

        context.setStrategy(new MinStrategy());
        Double minScore = context.calculateScore(1D, 4D, 2D, 3D);
        System.out.println("minScore = " + minScore);

    }
}
