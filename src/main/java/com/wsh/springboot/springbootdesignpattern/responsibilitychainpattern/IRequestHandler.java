package com.wsh.springboot.springbootdesignpattern.responsibilitychainpattern;

/**
 * @Description: 抽象请求接收者
 * @author: weishihuai
 * @Date: 2019/11/26 15:30
 */
public abstract class IRequestHandler {

    /**
     * 下一个请求接收者
     */
    private IRequestHandler nextHandler;

    /**
     * 获取下一个请求接收者对象
     *
     * @return 下一个请求接收者对象
     */
    public IRequestHandler getNextHandler() {
        return nextHandler;
    }

    /**
     * 设置下一个请求接收者
     *
     * @param nextHandler 下一个请求接收者
     */
    public void setNextHandler(IRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 请求处理的方法
     *
     * @param request 请求对象
     */
    protected abstract void handle(PhotoRequest request);

}
