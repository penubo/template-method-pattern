package com.company;

public class CookieMaker extends BakeryMaker {
    public CookieMaker() {
    }

    @Override
    public void prepareIngredients() {
        System.out.println("preparing Cookie's ingredients...");
    }

    @Override
    public void decorate() {
        System.out.println("decorating Cookie...");
    }

}
