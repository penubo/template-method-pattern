package com.company;

public class CakeMaker extends BakeryMaker {
    public CakeMaker() {
    }

    @Override
    public void decorate() {
        System.out.println("decorating the cake");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("prepare ingredients for cake.");
    }
}
