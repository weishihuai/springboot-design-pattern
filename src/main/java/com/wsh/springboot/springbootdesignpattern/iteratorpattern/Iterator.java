package com.wsh.springboot.springbootdesignpattern.iteratorpattern;

/**
 * @Description: 抽象迭代器接口
 * @author: weishihuai
 * @Date: 2019/11/20 14:53
 */
public interface Iterator {

     /**
     * 判断是否存在下一个元素
     *
     * @return true/false
     */
    boolean hasNext();

    /**
     * 返回聚合对象的下一个元素
     *
     * @return 下一个元素
     */
    Object next();

}
