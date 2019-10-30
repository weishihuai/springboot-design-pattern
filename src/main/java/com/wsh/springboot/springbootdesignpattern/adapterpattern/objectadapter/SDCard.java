package com.wsh.springboot.springbootdesignpattern.adapterpattern.objectadapter;

/**
 * @Description: SD内存卡（目标类）
 * @author: weishihuai
 * @Date: 2019/10/29 16:11
 */
public interface SDCard {
    /**
     * 读取SD内存卡信息
     *
     * @return String
     */
    String readSDCard();
}
