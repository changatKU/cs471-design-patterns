package decorator;

import ku.cs.Quackable;

public class QuackCounter implements Quackable {
    public static int numberOfQuacks = 0;
    private Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    //get number of quacks
    public static int getNumberOfQuacks(){
        return numberOfQuacks;
    }
}
