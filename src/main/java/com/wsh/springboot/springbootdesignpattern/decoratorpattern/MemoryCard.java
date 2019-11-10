package com.wsh.springboot.springbootdesignpattern.decoratorpattern;

/**
 * @Description: 内存卡类(具体的构建角色)
 * @author: weixiaohuai
 * @Date: 2019/11/10 14:00
 */
public class MemoryCard extends Computer {

    @Override
    public void improve() {
        System.out.println("原装内存只有4G...");
    }

}
