package com.company;

public class CakeMaker {
    public CakeMaker() {
    }

    public void make() {
        prepareIngredients();
        createDough();
        decorate();
        pack();
    }

    private void pack() {
        System.out.println("packing the cake");
    }

    private void decorate() {
        System.out.println("decorating the cake");
    }

    private void createDough() {
        System.out.println("creating cake dough");
    }

    private void prepareIngredients() {
        System.out.println("prepare ingredients for cake.");
    }
}
