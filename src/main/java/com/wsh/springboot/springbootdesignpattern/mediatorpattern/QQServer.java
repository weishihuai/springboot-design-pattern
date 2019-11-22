package com.wsh.springboot.springbootdesignpattern.mediatorpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 具体中介者：QQ服务器
 * @Author: weixiaohuai
 * @Date: 2019/11/22
 * @Time: 21:51
 */
public class QQServer extends Mediator {

    /**
     * 具体中介者类持有多个同事类对象引用
     */
    private Map<String, Colleague> colleagueMap = new HashMap<>();

    @Override
    public void register(String key, Colleague colleague) {
        colleagueMap.put(key, colleague);
    }

    @Override
    public void sendMessage(String key) {
        Colleague colleague = colleagueMap.get(key);
        if (null != colleague) {
            colleague.receiveMessage();
        }
    }
}
