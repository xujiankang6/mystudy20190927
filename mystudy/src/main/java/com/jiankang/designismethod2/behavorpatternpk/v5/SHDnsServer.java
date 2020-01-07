package com.jiankang.designismethod2.behavorpatternpk.v5;

/*
 *@create by jiankang
 *@date 2020/1/6 time 21:10
 */

public class SHDnsServer extends DnsServer {
    @Override
    public boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海DNS服务器");
        return recorder;
    }
}
