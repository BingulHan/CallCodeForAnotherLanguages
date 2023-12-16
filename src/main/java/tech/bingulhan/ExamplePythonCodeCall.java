package tech.bingulhan;

import org.python.util.PythonInterpreter;

public class ExamplePythonCodeCall {
    public static void main(String[] args) {

        try (PythonInterpreter interpreter = new PythonInterpreter()){
            interpreter.exec("print('Hello Python World!')");
        }
    }
}