package com.jiankang.designismethod2.behavorpatternpk.v5;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:56
 */

public class Recorder {
    private String domain;
    private String ip;
    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Recorder{" +
                "domain='" + domain + '\'' +
                ", ip='" + ip + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
