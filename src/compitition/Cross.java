package compitition;

public class Cross extends Obstance {
    int lenght;
    public Cross(int lenght){
        this.lenght = lenght;
    }
    @Override
    public void doIt(Team team) {
        team.run(this.lenght);
    }
}
