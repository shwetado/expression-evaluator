package shwetado.cli;

import shwetado.evaluator.Evaluator;

public class EvaluatorClient {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator("1 + 5");
        System.out.println(evaluator.getExpression());
    }
}