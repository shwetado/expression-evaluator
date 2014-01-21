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
        List<String> operators = new ArrayList<String>();
        for (String operator : values) {
            try {
                operands.add(Integer.parseInt(operator));
            } catch (Exception ex) {
                operators.add(operator);
            }
        }
        Operation op = new Operation();
        return op.evaluateResult(operators.get(0),operands.get(0),operands.get(1));
    }
}
