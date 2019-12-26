package com.jiankang.designismethod2.flyweightpattern.v4;

/*
 *@create by jiankang
 *@date 2019/12/25 time 16:46
 */

public class ExtrinsicState {
    private String subject;
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        return subject.hashCode() + location.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExtrinsicState) {
            ExtrinsicState state = (ExtrinsicState) obj;
            return state.getLocation().equals(location) && state.getSubject().equals(subject);
        }
        return false;
    }
}
