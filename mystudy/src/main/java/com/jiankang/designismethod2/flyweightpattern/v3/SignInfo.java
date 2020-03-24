package com.jiankang.designismethod2.flyweightpattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/24 time 14:16
 */

public class SignInfo {
    private String id;
    private String location;
    private String subject;
    private String postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
