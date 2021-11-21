package be.cds.circus.monkey;

import be.cds.circus.exception.UnknownTrickException;
import be.cds.circus.monkey.trick.Trick;
import be.cds.circus.monkey.trick.TypeOfTrick;

import java.util.ArrayList;
import java.util.List;

public class Monkey {

    private String name;
    private List<Trick> tricks;

    public Monkey(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void learnATrick(String trickName, TypeOfTrick typeOfTrick){
        Trick newTrick = new Trick(trickName, typeOfTrick);
        this.getTricks().add(newTrick);
    }

    public Trick showHisTrick(int index) throws UnknownTrickException {
        if(index >= tricks.size()){
            throw new UnknownTrickException("Votre singe ne connait pas ce tour, essayez de lui en demander un autre (il en connait) " + tricks.size());
        }
        else{
            return tricks.get(index);
        }
    }

    public List<Trick> showAllYourTricks() {
        return tricks;
    }
    
    public List<Trick> getTricks(){
        if(this.tricks == null) this.tricks = new ArrayList<>();
        return this.tricks;
    }
    
}
