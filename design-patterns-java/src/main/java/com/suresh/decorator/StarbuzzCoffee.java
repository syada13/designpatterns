package com.suresh.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDecsription() + " $" + beverage.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        // darkRoast = new Soy(darkRoast);

        System.out.println(darkRoast.getDecsription() + " $" + darkRoast.cost());

    }

}
