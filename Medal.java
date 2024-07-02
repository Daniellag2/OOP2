package Olympics;

public class Medal {

    public enum MedalType{bronze,silver,gold}
    private String tournament;
    private MedalType type;
    private int year;

    public Medal(String tournament, MedalType type , int year){
        this.type=type;
        this.tournament = tournament;
        this.year = year;
    }

    public Medal() {
        this.type = MedalType.bronze; // Default type
        this.tournament = "Israel";
        this.year = 1998;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "tournament:" + tournament + "Medal type" + type + " Year:" + year;
    }
}
