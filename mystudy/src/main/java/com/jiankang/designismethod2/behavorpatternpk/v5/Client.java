package com.jiankang.designismethod2.behavorpatternpk.v5;

/*
 *@create by jiankang
 *@date 2020/1/6 time 21:14
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        DnsServer dnsServer = new SHDnsServer();
        DnsServer chinaTopDnsServer = new ChinaTopDnsServer();
        DnsServer topDnsServer = new TopDnsServer();
        dnsServer.setUpperServer(chinaTopDnsServer);
        chinaTopDnsServer.setUpperServer(topDnsServer);
        while (true) {
            System.out.println("输入域名，n为退出：");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (domain.equalsIgnoreCase("n")) {
                return;
            }
            Recorder recorder = dnsServer.resolve(domain);
            System.out.println(recorder);
        }
    }
}
