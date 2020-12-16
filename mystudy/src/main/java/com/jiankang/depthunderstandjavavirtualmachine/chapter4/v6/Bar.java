package com.jiankang.depthunderstandjavavirtualmachine.chapter4.v6;

/*
 *@create by jiankang
 *@date 2020/12/5 @time 15:32
 * HSDIS:JIT生成代码反汇编,还没实现，报错状态
-XX:+UnlockDiagnosticVMOptions
 -XX:+PrintAssembly
-Xcomp
-XX:CompileCommand=dontinline,*Bar.sum
-XX:Compile-Command=compileonly,*Bar.sum
test.Bar
 */


public class Bar {
    int a = 1;
    static int b = 2;


    public int sum(int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        new Bar().sum(3);
    }
}

