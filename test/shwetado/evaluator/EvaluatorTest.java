package shwetado.evaluator;

import org.junit.Assert;
import org.junit.Test;

public class EvaluatorTest {
    @Test
    public void testGivesTheActualExpressionGiven() throws Exception {
        String expression = "1 + 5";
        Evaluator evaluator = new Evaluator(expression);
        String actual = evaluator.getExpression();
        Assert.assertEquals(actual,expression);
    }

    @Test
    public void testGivesTheAdditionOfTwoNumbers() throws Exception {
        String expression = "1 + 1";
        int expected = 2;
        Evaluator evaluator = new Evaluator(expression);
        int actual = evaluator.getResult();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheSubtractionOfTwoNumbers() throws Exception {
        String expression = "1 - 1";
        int expected = 0;
        Evaluator evaluator = new Evaluator(expression);
        int actual = evaluator.getResult();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheMultiplicationOfTwoNumbers() throws Exception {
        String expression = "10 * 2";
        int expected = 20;
        Evaluator evaluator = new Evaluator(expression);
        int actual = evaluator.getResult();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheDivideResultOfTwoNumber() throws Exception {
        String expression = "10 / 2";
        int expected = 5;
        Evaluator evaluator = new Evaluator(expression);
        int actual = evaluator.getResult();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheRaiseTwoOfTwoNumber() throws Exception {
        String expression = "2 ^ 2";
        int expected = 4;
        Evaluator evaluator = new Evaluator(expression);
        int actual = evaluator.getResult();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheAdditionOfThreeNumbers() throws Exception {
        String expression = "2 + 2 + 2";
        int expected = 6;
        Evaluator evaluator = new Evaluator(expression);
        int actual = evaluator.getResult();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheSubtractionOfThreeNumbers() throws Exception {
        String expression = "12 - 2 - 2";
        int expected = 8;
        Evaluator evaluator = new Evaluator(expression);
        int actual = evaluator.getResult();
        Assert.assertEquals(expected, actual);
    }

}