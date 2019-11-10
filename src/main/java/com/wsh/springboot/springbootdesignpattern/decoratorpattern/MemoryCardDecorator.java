package com.wsh.springboot.springbootdesignpattern.decoratorpattern;

/**
 * @Description: 具体装饰者角色, 实际是在这里扩展对象的功能
 * @author: weixiaohuai
 * @Date: 2019/11/10 14:00
 */
public class MemoryCardDecorator extends ComputerDecorator {

    public MemoryCardDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public void improve() {
        super.improve();
        //加装内存条
        this.addMemoryCard();
    }

    private void addMemoryCard() {
        System.out.println("加一条8G内存条...");
    }

}
