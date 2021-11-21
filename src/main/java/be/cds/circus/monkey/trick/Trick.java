package be.cds.circus.monkey.trick;

public class Trick {

    public String name;
    public TypeOfTrick typeOfTrick;

    public Trick(String name, TypeOfTrick typeOfTrick) {
        this.name = name;
        this.typeOfTrick = typeOfTrick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfTrick getTypeOfTrick() {
        return typeOfTrick;
    }

    public void setTypeOfTrick(TypeOfTrick typeOfTrick) {
        this.typeOfTrick = typeOfTrick;
    }
}
