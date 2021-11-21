package be.cds.circus.spectator;

import be.cds.circus.monkey.trick.TypeOfTrick;
import be.cds.circus.spectator.reaction.Reaction;

public class Spectator {

    public Spectator(){}

    public Reaction getReaction(TypeOfTrick trick){
        switch (trick){
            case MUSICAL: return Reaction.WHISTLE;
            case ACROBATIC: return Reaction.APPLAUSE;
            default: return Reaction.WONDER;
        }
    }
}
