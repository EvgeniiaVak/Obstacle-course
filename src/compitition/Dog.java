package compitition;

public class Dog extends Animal{
    public Dog(){
        this.type = "Собака";
        super.maxRunDistance = (int) Math.round(Math.random ()*200+1800);
        super.maxJumpHeight = (int) Math.round(Math.random ()*2+2);
        super.maxSwimDistance = (int) Math.round(Math.random ()*5+20);
    }
}
