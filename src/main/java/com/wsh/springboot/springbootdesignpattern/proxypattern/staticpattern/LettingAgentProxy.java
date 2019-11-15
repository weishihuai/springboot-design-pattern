package com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern;

/**
 * @Description: 房屋中介代理对象
 * @author: weishihuai
 * @Date: 2019/11/15 17:15
 */
public class LettingAgentProxy implements DailyBehavior {
    /**
     * 持有一个被代理对象的引用
     */
    private Landlord landlord;

    public LettingAgentProxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rentApartment() {
        this.prev();
        landlord.rentApartment();
    }

    private void prev() {
        System.out.println("中介帮忙找房东...");
    }

}
