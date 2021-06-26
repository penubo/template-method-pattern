package com.company;

public class CookieMaker {
    public CookieMaker() {
    }

    public void make() {
        prepareIngredients();
        createDough();
        decorate();
        pack();
    }

    private void pack() {
        System.out.println("packing the cookie");
    }

    private void decorate() {
        System.out.println("decorating the cookie");
    }

    private void createDough() {
        System.out.println("creating cookie dough");
    }

    private void prepareIngredients() {
        System.out.println("prepare ingredients for cookie.");
    }
}
