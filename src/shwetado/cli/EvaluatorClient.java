package shwetado.cli;

import shwetado.evaluator.Evaluator;

public class EvaluatorClient {
    public static void main(String[] args) throws Exception {
        Evaluator evaluator = new Evaluator(args[0]);
        System.out.println(evaluator.getResult());
    }
}