package com.jiankang.otherstudy.v3.v2;

/**
 * Context
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class Context {
    private Student student;
    private State currentState;





    public void doAction() {
        this.currentState.action();

    }

    public State getNextSate() {
        return currentState.nextState;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

}
