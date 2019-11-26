package com.wsh.springboot.springbootdesignpattern.responsibilitychainpattern;

/**
 * @Description: 精修照片请求类
 * @author: weishihuai
 * @Date: 2019/11/26 15:29
 */
public class PhotoRequest {

    /**
     * 类型
     */
    private String type;

    /**
     * 张数
     */
    private Integer photoNum;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPhotoNum() {
        return photoNum;
    }

    public void setPhotoNum(Integer photoNum) {
        this.photoNum = photoNum;
    }

    public PhotoRequest(String type, Integer photoNum) {
        this.type = type;
        this.photoNum = photoNum;
    }
}
