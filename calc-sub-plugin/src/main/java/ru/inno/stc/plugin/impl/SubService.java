package ru.inno.stc.plugin.impl;

import ru.inno.stc.osgi.api.CalculatorService;

public class SubService implements CalculatorService {

    @Override
    public String name() {
        return "Subtraction";
    }

    @Override
    public String operator() {
        return "minus";
    }

    @Override
    public int execute(int n1, int n2) {
        return n1 - n2;
    }

}
