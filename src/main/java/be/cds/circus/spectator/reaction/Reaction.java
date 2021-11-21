package be.cds.circus.spectator.reaction;

public enum Reaction {

    APPLAUSE("Applaudit"),
    WHISTLE ("Siffle"),
    WONDER("Se demande ce qu'il se passe");

    private String value;

    Reaction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
