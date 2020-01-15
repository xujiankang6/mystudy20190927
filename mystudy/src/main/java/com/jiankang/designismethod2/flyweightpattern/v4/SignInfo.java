package com.jiankang.designismethod2.flyweightpattern.v4;

/*
 *@create by jiankang
 *@date 2019/12/24 time 14:16
 */

public class SignInfo {
    private String id;
    private String location;
    private String subject;
    private String postAddress;
    private final ExtrinsicState extrinsicState;

    public SignInfo(ExtrinsicState extrinsicState) {
        this.extrinsicState = extrinsicState;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return extrinsicState.getLocation();
    }


    public String getSubject() {
        return extrinsicState.getSubject();
    }


    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
