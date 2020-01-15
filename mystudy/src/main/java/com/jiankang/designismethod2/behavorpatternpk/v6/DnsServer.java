package com.jiankang.designismethod2.behavorpatternpk.v6;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:58
 */

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public abstract class DnsServer extends Observable implements Observer {
    //上级DNS是谁
    private DnsServer upperServer;

    @Override
    public void update(Observable o, Object arg) {

    }

    //解析域名
    public final Recorder resolve(String domain) {
        Recorder recorder = null;
        if (isLocal(domain)) {
            recorder = echo(domain);
        } else {
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }


    public abstract boolean isLocal(String domain);

    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setIp(genIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }

    private String genIpAddress() {
        Random rand = new Random();
        String address = rand.nextInt(255) + "." +
                rand.nextInt(255) + "." +
                rand.nextInt(255) + "." +
                rand.nextInt(255);
        return address;

    }
}
