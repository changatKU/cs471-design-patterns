package factory;

import decorator.QuackCounter;
import decorator.QuackEcho;
import ku.cs.MallardDuck;
import ku.cs.Quackable;
import ku.cs.RedheadDuck;
import ku.cs.RubberDuck;

public class DuckCounterAndEchoFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
