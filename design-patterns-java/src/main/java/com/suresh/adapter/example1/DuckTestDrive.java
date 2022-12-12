package com.suresh.adapter.example1;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck(); // Create a duck object
        Turkey turkey = new WildTurkey(); // Create a turkey object

        Duck turkeyAdapter = new TurkeyAdapter(turkey); // Wrap the turkey in a TurkeyAdapter which makes it look like a

        System.out.println("The Turkey says....");
        turkey.gooble();
        turkey.fly();

        System.out.println("\nThe Duck says....");
        testDuck(duck);

        System.out.println("\nThe Turkey Adapter says....");
        testDuck(turkeyAdapter); // Pass turkey as Duck

    }

    /*
     * It gets a duck and calls its quack() and fly() methods.
     * This method never knows it has turkey disguised as a duck!
     */
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();

    }

}
