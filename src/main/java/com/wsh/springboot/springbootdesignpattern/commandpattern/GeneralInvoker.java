package com.wsh.springboot.springbootdesignpattern.commandpattern;

/**
 * @Description: 将军调用者
 * @Author: weixiaohuai
 * @Date: 2019/11/19
 * @Time: 20:43
 */
public class GeneralInvoker {

    /**
     * 持有抽象命令的一个引用
     */
    private Command command;

    public GeneralInvoker(Command command) {
        this.command = command;
    }

    public void launchAttack() {
        System.out.println("将军发出命令 : 发起进攻！");
        //执行命令
        this.command.execute();
    }

}
