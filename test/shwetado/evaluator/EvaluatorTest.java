package shwetado.evaluator;

import org.junit.Assert;
import org.junit.Test;

public class EvaluatorTest {
    @Test
    public void testGetExpression() throws Exception {
        String expression = "1 + 5";
        Evaluator evaluator = new Evaluator(expression);
        String actual = evaluator.getExpression();
        Assert.assertEquals(actual,expression);
    }
}