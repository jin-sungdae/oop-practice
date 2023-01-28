package org.example;

import org.example.calculate.PositiveNumber;

public interface NewArtihmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
