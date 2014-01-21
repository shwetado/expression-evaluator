Expression - Evaluator
====================
This repository has implementation for evaluating mathematical expressions according to `BOD MAS`.

#### How do you install?
* Download the `.jar` and `.sh` files.
* Then you can just run the shell file.
* If you want to run expression-evaluator then then
    `sh sd_evaluator.sh $expression`.

##### expression-evauator :
* You need to give your expression in form of:
        `operand operator operand` each separated by spaces!
* Evaluates the given expression.
* For example: `2 + 3`

```
sd_evaluator.sh expression
```

##### expression-evauator :
* Works for:

```
It accepts:
    Positive numbers
    One operator
    Two operands
    Operators like : +, - , * , / , ^
Exceptions:
    Negative numbers
    Decimal numbers
    Brackets
```