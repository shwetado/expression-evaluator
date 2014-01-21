package shwetado.evaluator;

import java.util.HashMap;
import java.util.Map;

interface Operator {
    void operate(int operand1, int operand2);
}

public class Operation {
    int result;
    public int evaluateResult(String operator,int num1,int num2) throws Exception {
        Map<String, Operator> methodMap = new HashMap<String, Operator>();
        methodMap.put("+", new Operator() {
            public void operate(int operand1, int operand2) {
                result = operand1 + operand2;
            }
        });

        methodMap.put("-", new Operator() {
            public void operate(int operand1, int operand2) {
                result = operand1 - operand2;
            }
        });

        methodMap.put("*", new Operator() {
            public void operate(int operand1, int operand2) {
                result = operand1 * operand2;
            }
        });

        methodMap.put("/", new Operator() {
            public void operate(int operand1, int operand2) {
                result = operand1 / operand2;
            }
        });

        methodMap.put("^", new Operator() {
            public void operate(int operand1, int operand2) {
                result = (int) Math.pow(operand1, operand2);
            }
        });

        methodMap.get(operator).operate(num1, num2);
        return result;
    }
}