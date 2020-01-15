package com.jiankang.designismethod2.behavorpatternpk.v5;

/*
 *@create by jiankang
 *@date 2020/1/6 time 21:10
 */

public class ChinaTopDnsServer extends DnsServer {
    @Override
    public boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("中国顶级DNS服务器");
        return recorder;
    }
}
