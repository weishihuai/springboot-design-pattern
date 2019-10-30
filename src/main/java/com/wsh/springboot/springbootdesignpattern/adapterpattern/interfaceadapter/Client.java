package com.wsh.springboot.springbootdesignpattern.adapterpattern.interfaceadapter;


/**
 * @Description:
 * @author: weishihuai
 * @Date: 2019/10/29 17:59
 */
public class Client {
    public static void main(String[] args) {

        IUserService userService = new IUserService();
        userService.setiUserInterface(new IUserInterface() {
            @Override
            public void addUser() {
                System.out.println("【IUserInterface】新增用户...");
            }

            @Override
            public void updateUser() {

            }

            @Override
            public void deleteUser() {

            }
        });
        userService.addUser();

        System.out.println("======================================");
        userService.setiUserInterface(new IUserAdapter() {
            @Override
            public void addUser() {
                System.out.println("【IUserAdapter】新增用户...");
            }
        });
        userService.addUser();

    }
}
