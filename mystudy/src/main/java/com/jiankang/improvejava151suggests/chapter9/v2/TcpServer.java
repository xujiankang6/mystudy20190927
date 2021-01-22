package com.jiankang.improvejava151suggests.chapter9.v2;

/*
 *@create by jiankang
 *@date 2020/11/3 time 20:20
 * 使用线程异常处理器提升系统可靠性
 */

public class TcpServer implements Runnable {


    //创建即运行
    public TcpServer() {
        Thread t = new Thread(this);
         t.setUncaughtExceptionHandler(new TcpServerExceptionHandler());
         t.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("系统正常运行： " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new RuntimeException();

    }

    //异常处理器
    private static class TcpServerExceptionHandler implements Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("线程 ： " + t.getName() + "  出现异常，自行重启，请分析原因！");
            e.printStackTrace();
            //重启线程，保证业务不中断
            new TcpServer();
        }
    }
}
