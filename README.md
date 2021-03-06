Expression - Evaluator
====================
[![Build Status](https://travis-ci.org/shwetado/expression-evaluator.png)](https://travis-ci.org/shwetado/expression-evaluator)

This repository has implementation for evaluating mathematical expressions according to `BOD MAS`.

#### How do you install?
* Download the `.jar` and `.sh` files.
* Then you can just run the shell file.
* If you want to run expression-evaluator then then
    `sh sd_evaluator.sh $expression`.

##### expression-evaluator :
* You need to give your expression in form of:
        `operand operator operand` each separated by spaces!
* It atleast needs one operator and two operands!
* Evaluates the given expression.
* For example: `2 + 3`

```
sd_evaluator.sh expression
```

#### Releases work for:

##### Release 0.6: Works for:

```
    Input without blank spaces in between
```
Example:
```
sd_evaluator.sh "200.0--200.0"
```
Output: 0

##### Release 0.5: Works for:

```
	Decimal numbers
	Negative numbers
```
Example:
```
sd_evaluator.sh "200.0 - -200.0"
```
Output: 0

##### Release 0.4: Works for:

```
It accepts:
    Nested Parentheses ' ( ( ) )'
    Multiple Set of parentheses ‘ ( ) ‘
```
Accepts expressions in the form given below:

```
sd_evaluator.sh "operand operator ( operand operator ( operand operator operator ) operator operand ) {[operands operators operands]...}"
```
Example:
```
sd_evaluator.sh "200 - ( 10 * ( 10 + 10 ) + 1 ) + 10"
```
Output: 9

##### Release 0.3: Works for:

```
It accepts:
    1 Set of parentheses ‘ ( ) ‘
```
Accepts expressions in the form given below:

```
sd_evaluator.sh "operand operator ( operand operator operand ) {[operands operators operands]...}"
```
Example:
```
sd_evaluator.sh "200 - ( 10 * 10 + 10 ) + 10"
```
Output: 200

##### Release 0.2: Works for:

```
It accepts:
    Multiple operators
    Multiple operands
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

### Known Bugs:

* The "raise to a power" gives constant value when the integer range is over!
