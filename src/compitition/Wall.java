package compitition;

public class Wall extends Obstance {
    int height;
    public Wall(int height){
        this.height = height;
    }
    @Override
    public void doIt(Team team) {
        team.jump(this.height);
    }
}
