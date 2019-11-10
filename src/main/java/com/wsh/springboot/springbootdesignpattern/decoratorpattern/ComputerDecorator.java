package com.wsh.springboot.springbootdesignpattern.decoratorpattern;

/**
 * @Description: 抽象装饰者类
 * @author: weixiaohuai
 * @Date: 2019/11/10 14:00
 */
public abstract class ComputerDecorator extends Computer {
    //抽象装饰者类持有一个抽象构建角色的引用
    private Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void improve() {
        this.computer.improve();
    }
}
