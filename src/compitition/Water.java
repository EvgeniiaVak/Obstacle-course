package compitition;

public class Water extends Obstance {
    int length;
    public Water(int length){
        this.length=length;
    }
    @Override
    public void doIt(Animal a) {
        a.swim(this.length);
    }
}
