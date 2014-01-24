package shwetado.evaluator;

import java.util.ArrayList;
import java.util.List;

public class Evaluator extends Operation{
    String expression;

    public Evaluator(String expression) {
        super();
        this.expression = getExpressionWithSpace(expression.trim());
    }

    public String getExpression() {
        return this.expression.trim();
    }

    public double getResult (String innerExpression) throws Exception {
        String inputExpr = innerExpression;
        List<Double> operands = new ArrayList<Double>();

        if (inputExpr.contains("(")){
            inputExpr = manageParentheses(inputExpr);
            return getResult(inputExpr);
        }
        return evaluateResult(inputExpr, operands);
    }

    private double evaluateResult(String inputExpr, List<Double> operands) throws Exception {
        String[] exprValues;
        exprValues = inputExpr.split(" ");

        List<String> operators = getAllOperatorsAndOperands(exprValues, operands);

        Operation op = new Operation();
        return calculateAll(operands, operators, op);
    }

    public double getResult () throws Exception {
        return getResult(this.expression);
    }

    private List<String> getAllOperatorsAndOperands(String[] values, List<Double> operands){
        List<String> operators = new ArrayList<String>();
        for (String operator : values) {
            try {
                operands.add(Double.parseDouble(operator));
            } catch (Exception ex) {
                operators.add(operator);
            }
        }
        return operators;
    }

    private double calculateAll(List<Double> operands, List<String> operators, Operation op) throws Exception {

        double operand = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            operand = op.evaluateResult(operators.get(i),operand,operands.get(i + 1));
        }
        return operand;

    }

    public String getExpressionWithSpace(String exp) {
        String expression = exp;
        expression = expression.replaceAll(" +", "");
        return expression.replaceAll("\\+", " + ")
                .replaceAll("\\-", " - ")
                .replaceAll("\\*", " * ")
                .replaceAll("/", " / ")
                .replaceAll("\\^", " ^ ")
                .replaceAll("\\(", "( ")
                .replaceAll("\\)", " )")
                .replaceAll("  - ", " -")
                .replaceFirst("^ - ", "-");
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
        double result = getResult(innerExpression.toString().trim());
        exp.replace(beginIndex, endIndex + 1, Double.toString(result));
        return exp.toString().trim();
    }
}