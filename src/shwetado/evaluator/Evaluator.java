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

    public int getResult () throws Exception {
        String[] values  = this.expression.split(" ");
        List<Integer> operands = new ArrayList<Integer>();
        List<String> operators = getAllOperatorsAndOperands(values, operands);
        Operation op = new Operation();
        return getResultForMultiple(operands, operators, op);
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

}