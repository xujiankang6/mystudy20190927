package com.jiankang.depthunderstandjavavirtualmachine.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/11/22 @time 13:34
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/22   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed !");
        FinalizeEscapeGC.SAVE_HOOK=this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();
        SAVE_HOOK=null;
        System.gc();

        Thread.sleep(5000);
        //当gc调用以后，会执行一下finalize方法，如何重新与引用链上任何对象建立广联，会避免被回收，一个对象的finalize方法最多只会被系统调用一次
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no . i am dead");
        }

        SAVE_HOOK=null;
        System.gc();
        Thread.sleep(5000);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no . i am dead");
        }
    }
}
