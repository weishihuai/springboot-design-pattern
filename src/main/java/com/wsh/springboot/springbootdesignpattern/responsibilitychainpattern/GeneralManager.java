package com.wsh.springboot.springbootdesignpattern.responsibilitychainpattern;

/**
 * @Description: 总经理
 * @author: weishihuai
 * @Date: 2019/11/26 15:34
 */
public class GeneralManager extends IRequestHandler {
    @Override
    protected void handle(PhotoRequest request) {
        Integer photoNum = request.getPhotoNum();
        if (photoNum > 50 && photoNum <= 55) {
            System.out.println("以我的权限【总经理】最多可以给你争取到55张精修照片...");
        } else {
            IRequestHandler nextHandler = getNextHandler();
            if (null != nextHandler) {
                nextHandler.handle(request);
            } else {
                System.out.println("抱歉，无法满足你们的要求...");
            }
        }
    }
}
