package com.wsh.springboot.springbootdesignpattern.iteratorpattern;

/**
 * @Description: 班级具体的迭代器
 * @author: weishihuai
 * @Date: 2019/11/20 15:03
 */
public class ClassRoomIterator implements Iterator {
    /**
     * 持有一个具体聚合对象的引用
     */
    private ClassRoomAggregate classRoomAggregate;
    /**
     * 索引
     */
    private int currentIndex;

    public ClassRoomIterator(ClassRoomAggregate classRoomAggregate) {
        this.classRoomAggregate = classRoomAggregate;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < classRoomAggregate.length();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Student student = classRoomAggregate.getStudent(currentIndex);
            currentIndex++;
            return student;
        }
        return null;
    }

}
