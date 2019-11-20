package com.wsh.springboot.springbootdesignpattern.iteratorpattern;

/**
 * @Description: 抽象聚合对象容器
 * @author: weishihuai
 * @Date: 2019/11/20 14:56
 */
public interface Aggregate {
    /**
     * 返回迭代器对象
     *
     * @return 迭代器对象
     */
    Iterator getIterator();
}
