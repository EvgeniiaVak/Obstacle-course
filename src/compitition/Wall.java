package compitition;

public class Wall extends Obstance {
    int height;
    public Wall(int height){
        this.height = height;
    }
    @Override
    public void doIt(Animal a) {
        a.jump(this.height);
    }
}
