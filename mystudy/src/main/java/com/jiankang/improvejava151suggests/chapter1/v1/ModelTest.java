package com.jiankang.improvejava151suggests.chapter1.v1;

/*
 *@create by jiankang
 *@date 2020/6/1 time 12:47
 */

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * 易变业务使用脚本语言编写
 */

public class ModelTest {
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        Bindings bind = engine.createBindings();
        bind.put("factor",1);
        engine.setBindings(bind, ScriptContext.ENGINE_SCOPE);
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            int first = input.nextInt();
            int sec = input.nextInt();
            System.out.println("输入参数是："+first+","+sec);
            engine.eval(new FileReader("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\improvejava151suggests\\chapter1\\v1\\model.js"));
            if(engine instanceof Invocable){
                Invocable in = (Invocable) engine;
                Double result = (Double) in.invokeFunction("formula",first,sec);
                System.out.println("运算结果： "+result.intValue());
            }
        }
    }
}
