package ru.inno.stc.osgi.api;

public interface CalculatorService {

    String name();

    String operator();

    int execute(int n1, int n2);
}
