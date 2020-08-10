package ru.inno.stc.plugin.impl;

import ru.inno.stc.osgi.api.CalculatorService;

public class AddService implements CalculatorService {

    @Override
    public int execute(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public String name() {
        return "Addition";
    }

    @Override
    public String operator() {
        return "plus";
    }

}
