package be.cds.circus.show;

import be.cds.circus.exception.NoMonkeyException;
import be.cds.circus.monkey.Monkey;
import be.cds.circus.monkey.trick.Trick;
import be.cds.circus.monkey.trick.TypeOfTrick;
import be.cds.circus.spectator.reaction.Reaction;
import be.cds.circus.trainer.Trainer;
import be.cds.circus.spectator.Spectator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Show {

    private Spectator spectator;
    private List<Trainer> trainers;

    public Show(){}

    public void prepareTheShow() throws NoMonkeyException {
        spectator = new Spectator();
        this.prepareTheTrainers();
    }

    private void prepareTheTrainers() throws NoMonkeyException {
        trainers = new ArrayList<>();
        Trainer trainer1 = prepareTheFirstTrainer();
        this.trainers.add(trainer1);
        Trainer trainer2 = prepareTheSecondTrainer();
        this.trainers.add(trainer2);
    }

    private Trainer prepareTheSecondTrainer() throws NoMonkeyException {
        Trainer trainer = new Trainer();
        Monkey monkey = new Monkey("King Louis");
        trainer.adoptAMonkey(monkey);
        teachMusicalTrick(trainer, "Wanna Be Like You");
        teachAcrobaticalTrick(trainer, "Danse sur la musique du livre de la jungle");
        return trainer;
    }

    private Trainer prepareTheFirstTrainer() throws NoMonkeyException {
        Trainer trainer = new Trainer();
        Monkey monkey = new Monkey("Cheetah");
        trainer.adoptAMonkey(monkey);
        teachAcrobaticalTrick(trainer, "Se Balance de liane en liane");
        teachMusicalTrick(trainer, "Crie comme Tarzan");
        return trainer;
    }

    private void teachMusicalTrick(Trainer trainer, String trickName) throws NoMonkeyException {
        trainer.trainMyMonkey(trickName, TypeOfTrick.MUSICAL);
    }

    private void teachAcrobaticalTrick(Trainer trainer, String trickName) throws NoMonkeyException {
        trainer.trainMyMonkey(trickName, TypeOfTrick.ACROBATIC);
    }

    public void letTheShowBegin(){
        for(Trainer trainer : trainers){
            List<Trick> tricks = trainer.getMonkey().showAllYourTricks();
            for(Trick trick : tricks){
                Reaction reaction = spectator.getReaction(trick.typeOfTrick);
                System.out.println("Le spectateur " + reaction.getValue() + " quand il voit que " + trainer.getMonkey().getName() +" "+ trick.getName());
            }
        }
    }

}
