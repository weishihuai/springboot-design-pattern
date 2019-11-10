package com.wsh.springboot.springbootdesignpattern.decoratorpattern;


public class Client {
    public static void main(String[] args) {
        Computer computer = new MemoryCard();
        computer.improve();
        System.out.println("======加装内存条之后======");
        computer = new MemoryCardDecorator(computer);
        computer.improve();
    }
}
