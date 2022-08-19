package factory;

import decorator.QuackCounter;
import ku.cs.MallardDuck;
import ku.cs.Quackable;
import ku.cs.RedheadDuck;
import ku.cs.RubberDuck;

public class DuckCounterFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
