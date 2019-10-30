package com.wsh.springboot.springbootdesignpattern.adapterpattern.objectadapter;

/**
 * @Description: 电脑类
 * @author: weishihuai
 * @Date: 2019/10/29 16:17
 */
public class Computer {
    /**
     * 电脑读取SD卡信息
     * @param sdCard SD卡
     * @return String
     */
    public String readSDCard(SDCard sdCard) {
        return sdCard.readSDCard();
    }
}
