package com.wsh.springboot.springbootdesignpattern.commandpattern;

/**
 * @Description: Command类的实现类
 * @Author: weixiaohuai
 * @Date: 2019/11/19
 * @Time: 20:42
 */
public class ConcreateCommand implements Command {

    /**
     * 持有命令执行者的一个引用
     */
    private SoldierReceiver receiver;

    public ConcreateCommand(SoldierReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.attack();
    }
}
