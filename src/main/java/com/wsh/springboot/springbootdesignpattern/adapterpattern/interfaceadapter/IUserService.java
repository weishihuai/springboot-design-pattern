package com.wsh.springboot.springbootdesignpattern.adapterpattern.interfaceadapter;

/**
 * @Description:
 * @author: weishihuai
 * @Date: 2019/10/29 17:58
 */
public class IUserService {

    private IUserInterface iUserInterface;

    public void setiUserInterface(IUserInterface iUserInterface) {
        this.iUserInterface = iUserInterface;
    }

    public void addUser() {
        iUserInterface.addUser();
    }

    public void updateUser() {
        iUserInterface.updateUser();
    }

    public void deleteUser() {
        iUserInterface.deleteUser();
    }
}
