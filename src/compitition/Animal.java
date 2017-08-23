package compitition;

public class Animal implements AbilityToSport{
    protected  int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;
    protected boolean onDistance;
    protected String type;
    protected String name;

    public Animal() {
        this.onDistance = true;
    }
    @Override
    public void run(int distance){
        if(distance<=this.maxRunDistance){
            System.out.println (this.type + " " + this.name + " пробежал дистанцию");
        }else {
            this.onDistance = false;
            System.out.println (this.type + " " + this.name + " не пробежал дистанцию");
        }
    }
    @Override
    public void jump (int height){
        if(height<=this.maxJumpHeight){
            System.out.println (this.type + " " + this.name + " перепрыгнул препятствие");
        }else{
            this.onDistance = false;
            System.out.println (this.type + " " + this.name + " не перепрыгнул препятствие");
        }
    }
    @Override
    public void swim (int swimDistance){
        if(this.maxSwimDistance == 0){
            System.out.println (this.type + " " + this.name + " не умеет плавать");
        }
        if(swimDistance<=this.maxSwimDistance){
            System.out.println (this.type + " " + this.name + " переплыл дистанцию");
        }else{
            this.onDistance = false;
            System.out.println (this.type + " " + this.name + " не переплыл дистанцию");
        }
    }
    @Override
    public void printResult(){
        if(onDistance) System.out.println (this.type + " " + this.name + " прошел полосу препятствий");
        else System.out.println (this.type + " " + this.name + " не прошел полосу препятствий");
    }
}
