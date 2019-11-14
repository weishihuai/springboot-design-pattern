package com.wsh.springboot.springbootdesignpattern.facadepattern;

/**
 * @Description: 客户端类
 * @Author: weixiaohuai
 * @Date: 2019/11/14
 * @Time: 11:40
 */
public class Client {
    public static void main(String[] args) {
        CookingFacade facade = new CookingFacade();
        //客户端简化了调用过程，通过调用外观高层接口直接依赖具体的各个子系统完成对应的功能
        facade.ready();
        facade.cooking();
        facade.end();
    }
}
