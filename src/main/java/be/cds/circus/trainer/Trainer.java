package be.cds.circus.trainer;

import be.cds.circus.exception.NoMonkeyException;
import be.cds.circus.monkey.Monkey;
import be.cds.circus.monkey.trick.Trick;
import be.cds.circus.monkey.trick.TypeOfTrick;

public class Trainer {

    public Monkey monkey;

    public Trainer(){}

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }

    public void adoptAMonkey(Monkey monkey){
        this.setMonkey(monkey);
    }

    public void trainMyMonkey(String trickName, TypeOfTrick typeOfTrick) throws NoMonkeyException {
        if(this.getMonkey() == null) throw new NoMonkeyException("This trainer does not have a monkey to train");
        this.getMonkey().learnATrick(trickName, typeOfTrick);
    }
}
