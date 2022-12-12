package com.suresh.adapter.example1;

/*
 * We're short of Duck objects and wants to leverage turkey objects.
 * We can't use it directly as their interface is different. We need to use an adapter for this.
 * 
 * TurkeyAdapter is implementing an interface it is adapting too(Duck interface)
 */

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;

    }

    public void quack() {
        turkey.gooble();

    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();

        }

    }

}
