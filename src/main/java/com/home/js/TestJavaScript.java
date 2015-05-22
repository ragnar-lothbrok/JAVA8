package com.home.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestJavaScript {

    public static void main(String[] args) {
        
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        String script = "var welcomemsg='Hello Friend'; welcomemsg;";
        
        try {
            Object result = scriptEngine.eval(script);
            System.out.println(result);
        } catch (ScriptException e) {
            System.out.println("Error Occured.");
            e.printStackTrace();
        }
        
    }
    
}
