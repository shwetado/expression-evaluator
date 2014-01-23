package shwetado.evaluator;

import java.util.ArrayList;
import java.util.List;

public class Evaluator extends Operation{
    String expression;

    public Evaluator(String expression) {
        super();
        this.expression = expression;
    }

    public String getExpression() {
        return this.expression;
    }

    public int getResult (String innerExpression) throws Exception {
        String inputExpr = innerExpression;
        List<Integer> operands = new ArrayList<Integer>();

        if (inputExpr.contains("(")){
            inputExpr = manageParentheses(inputExpr);
            return getResult(inputExpr);
        }
        return evaluateResult(inputExpr, operands);
    }

    private int evaluateResult(String inputExpr, List<Integer> operands) throws Exception {
        String[] exprValues;
        exprValues = inputExpr.split(" ");

        List<String> operators = getAllOperatorsAndOperands(exprValues, operands);

        Operation op = new Operation();
        return getResultForMultiple(operands, operators, op);
    }

    public int getResult () throws Exception {
        return getResult(this.expression);
    } 

    private List<String> getAllOperatorsAndOperands(String[] values, List<Integer> operands){
        List<String> operators = new ArrayList<String>();
        for (String operator : values) {
            try {
                operands.add(Integer.parseInt(operator));
            } catch (Exception ex) {
                operators.add(operator);
            }
        }
        return operators;
    }

    private int getResultForMultiple(List<Integer> operands, List<String> operators, Operation op) throws Exception {
        int result = op.evaluateResult(operators.get(0), operands.get(0), operands.get(1));
        for (int i = 1; i < operators.size(); i++) {
            result = op.evaluateResult(operators.get(i), result, operands.get(i + 1));
        }
        return result;
    }

    private String manageParentheses(String expression) throws Exception {
        int beginIndex = -1;
        int endIndex = -1;
        StringBuilder exp = new StringBuilder(expression);
        for(int i = 0; i < expression.length();  i++){
            if((expression.charAt(i) == '('))
                beginIndex = i;
            if((expression.charAt(i) == ')')){
                endIndex = i;
                break;
            }
        }
        StringBuffer innerExpression = new StringBuffer(expression.substring(beginIndex + 1, endIndex));
        int result = getResult(innerExpression.toString().trim());
        exp.replace(beginIndex, endIndex + 1, Integer.toString(result));
        return exp.toString().trim();
    }
}