package com.suresh.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        /*
         * To Change Duck behavior at runtime, just call the duck's setter method for
         * that behavior
         */

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
