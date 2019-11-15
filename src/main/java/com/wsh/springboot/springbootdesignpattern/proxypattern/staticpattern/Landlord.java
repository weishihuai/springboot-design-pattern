package com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern;

/**
 * @Description: 房东类
 * @author: weishihuai
 * @Date: 2019/11/15 17:15
 */
public class Landlord implements DailyBehavior {

    @Override
    public void rentApartment() {
        System.out.println("房东租房子...");
    }

}
