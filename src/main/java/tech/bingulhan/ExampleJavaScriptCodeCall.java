package tech.bingulhan;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExampleJavaScriptCodeCall {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        try {
            String script = "print('Hello World!');";
            engine.eval(script);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}