package com.company;

abstract public class BakeryMaker {
    public BakeryMaker() {
    }

    public void make() {
        prepareIngredients();
        createDough();
        decorate();
        pack();
    }

    abstract public void prepareIngredients();

    abstract public void decorate();

    private void pack() {
        System.out.println("packing...");
    }

    private void createDough() {
        System.out.println("creating dough...");
    }

}
