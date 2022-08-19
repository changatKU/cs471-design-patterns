package ku.cs;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> ducks = new ArrayList<Quackable>();

    @Override
    public void quack() {
        for (int i = 0;i < ducks.size(); i++) {
            if(i == 0){
                ducks.get(i).quack();
                ducks.get(i).quack();
                ducks.get(i).quack();
            }
            else{
                ducks.get(i).quack();
            }
        }
    }

    public void add(Quackable duck) {
        ducks.add(duck);
    }
}
