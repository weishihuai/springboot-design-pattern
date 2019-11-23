package com.wsh.springboot.springbootdesignpattern.mementopattern;

/**
 * @Description: 备忘录对象管理者
 * @Author: weixiaohuai
 * @Date: 2019/11/23
 * @Time: 21:13
 */
public class Caretaker {

    /**
     * 由于这里撤销学生删除只需要保存上一次的状态即可，所以这里没有使用集合来保存
     */
    private StudentMemento studentMemento;

    public StudentMemento getStudentMemento() {
        return studentMemento;
    }

    public void setStudentMemento(StudentMemento studentMemento) {
        this.studentMemento = studentMemento;
    }
}
