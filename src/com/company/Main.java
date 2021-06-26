package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BakeryMaker cakeMaker = new CakeMaker();
        BakeryMaker cookieMaker = new CookieMaker();

        cakeMaker.make();
        cookieMaker.make();
    }
}
