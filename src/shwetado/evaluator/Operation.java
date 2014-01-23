package shwetado.evaluator;

import java.util.HashMap;
import java.util.Map;

interface Operator {
    void operate(double operand1, double operand2);
}

public class Operation {
    double result;
    public double evaluateResult(String operator,double num1,double num2) throws Exception {
        Map<String, Operator> methodMap = new HashMap<String, Operator>();
        methodMap.put("+", new Operator() {
            public void operate(double operand1, double operand2) {
                result = operand1 + operand2;
            }
        });

        methodMap.put("-", new Operator() {
            public void operate(double operand1, double operand2) {
                result = operand1 - operand2;
            }
        });

        methodMap.put("*", new Operator() {
            public void operate(double operand1, double operand2) {
                result = operand1 * operand2;
            }
        });

        methodMap.put("/", new Operator() {
            public void operate(double operand1, double operand2) {
                result = operand1 / operand2;
            }
        });

        methodMap.put("^", new Operator() {
            public void operate(double operand1, double operand2) {
                result = Math.pow((double)operand1, (double)operand2);
            }
        });

        methodMap.get(operator).operate(num1, num2);
        return result;
    }
}