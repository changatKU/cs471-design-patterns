package factory;

import ku.cs.MallardDuck;
import ku.cs.Quackable;
import ku.cs.RedheadDuck;
import ku.cs.RubberDuck;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
