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
        double expected = 2;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheSubtractionOfTwoNumbers() throws Exception {
        String expression = "1 - 1";
        double expected = 0;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheMultiplicationOfTwoNumbers() throws Exception {
        String expression = "10 * 2";
        double expected = 20;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheDivideResultOfTwoNumber() throws Exception {
        String expression = "10 / 2";
        double expected = 5;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheRaiseTwoOfTwoNumber() throws Exception {
        String expression = "2 ^ 2";
        double expected = 4;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheAdditionOfThreeNumbers() throws Exception {
        String expression = "2 + 2 + 2";
        double expected = 6;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheSubtractionOfThreeNumbers() throws Exception {
        String expression = "12 - 2 - 2";
        double expected = 8;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheMultiplicationOfThreeNumbers() throws Exception {
        String expression = "2 * 2 * 2";
        double expected = 8;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheDivisionOfThreeNumbers() throws Exception {
        String expression = "20 / 1 / 2";
        double expected = 10;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesThePowerOfThreeNumbers() throws Exception {
        String expression = "2 ^ 2 ^ 2";
        double expected = 16;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultForDifferentOperatorsForThreeNumbers() throws Exception {
        String expression = "2 + 2 * 2";
        double expected = 8;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultForDifferentOperatorsAndMultipleOperands() throws Exception {
        String expression = "2 + 2 * 2 / 2 - 2 ^ 2";
        double expected = 4;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultWhenOneSetOfBracketsGiven() throws Exception {
        String expression = "20 - ( 2 + 2 )";
        double expected = 16;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultWhenOneSetOfBracketsGivenWithMultipleElements() throws Exception {
        String expression = "200 - ( 10 * 10 + 10 )";
        double expected = 90;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultForMultipleBrackets() throws Exception {
        String expression = "200 - ( 10 * 10 ) + ( 10 + 10 )";
        double expected = 120;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultWhenGivenNestedBrackets() throws Exception {
        String expression = "1 + ( 200 - ( 10 * 10 ) ) + ( 10 + 10 )";
        double expected = 121;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultWhenGivenNestedBracketsWithDifferentOperators() throws Exception {
        String expression = "1 + 2 * ( 4 - ( 12 / 3 - 3 ) + 2 ) ^ 3";
        double expected = 3375;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultWhenGivenNestedBracketsAndExpStartsWithBrackets() throws Exception {
        String expression = "( 1 + 2 * ( 4 - ( 12 / 3 - 3 ) + 2 ) ^ 3 )";
        double expected = 3375;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesCorrectOutputWhenInputHasExtraSpaces() throws Exception {
        String expression = "     ( 1 + 2 * ( 4 - ( 12 / 3 - 3 ) + 2 ) ^ 3 )       ";
        double expected = 3375;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesOutputForDecimals() throws Exception {
        String expression = "1.0 + 1.0";
        double expected = 2;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected,actual,1);
    }

    @Test
    public void testGivesOutputForDecimalsWith1SetOfParentheses() throws Exception {
        String expression = "1.0 + ( 1.0 + 1.0 ) + 1.0";
        double expected = 4;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected,actual,1);
    }

    @Test
    public void testGivesOutputForDecimalsWithMultipleSetOfParentheses() throws Exception {
        String expression = "1.0 + ( 1.0 + 1.0 ) + ( 1.0 + 1.0 )";
        double expected = 5;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected,actual,1);
    }

    @Test
    public void testGivesOutputForDecimalsWithNestedParentheses() throws Exception {
        String expression = "1.0 + ( 1.0 + ( 1.0 * 1.0 ) ) + 1.0";
        double expected = 4;
        Evaluator evaluator = new Evaluator(expression);
        double actual = evaluator.getResult();
        Assert.assertEquals(expected,actual,1);
    }


}