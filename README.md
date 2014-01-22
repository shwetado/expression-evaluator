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

#### Releases work for:

##### Release 0.1: Works for:

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
Accepts expressions in the form given below:

```
sd_evaluator.sh "operand operator operand"
```
Example:
```
sd_evaluator.sh "5 + 7"
```
Output: 12


##### Release 0.2: Works for:

```
It accepts
    Positive numbers
    Multiple operators
    Multiple operands
    Operators like : +, - , * , / , ^

Exceptions:
	Negative numbers
	Decimal numbers
	Brackets
```

Accepts expressions in the form given below:

```
sd_evaluator.sh "operand operator operand {[operands operators operands]...}"
```
Example:
```
sd_evaluator.sh "2 + 2 * 2 / 2 - 2 ^ 2"
```
Output: 4