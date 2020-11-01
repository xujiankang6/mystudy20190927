package com.jiankang.javacoretechnologythetenversion.dchapter10.v1;

/*
 *@create by jiankang
 *@date 2020/7/18 time 14:17
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {
    public static void main(String[] args) throws ScriptException {
        final ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        final ScriptEngineFactory scriptEngineFactory = scriptEngineManager.getEngineFactories().get(0);
        final ScriptEngine engine = scriptEngineFactory.getScriptEngine();
        engine.eval("n=1728");
        final Object eval = engine.eval("n+1");
        System.out.println(eval);
        final Object threading = scriptEngineFactory.getParameter("THREADING");
        System.out.println(threading);

        engine.put("k",1728);
        final Object eval1 = engine.eval("k+1");
        System.out.println(eval1);
        final Object result = engine.get("n");
        System.out.println(result );
        System.out.println(engine.getContext().getReader());

    }
}
