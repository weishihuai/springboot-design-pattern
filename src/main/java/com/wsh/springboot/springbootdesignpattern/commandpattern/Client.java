package com.wsh.springboot.springbootdesignpattern.commandpattern;

public class Client {
    public static void main(String[] args) {
        GeneralInvoker invoker = new GeneralInvoker(new ConcreateCommand(new SoldierReceiver()));
        invoker.launchAttack();
    }
}
