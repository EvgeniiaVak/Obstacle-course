package compitition;

public class Cat extends Animal{
    public Cat(){
        this.type = "Кот";
        super.maxRunDistance = (int) Math.round(Math.random ()*200+1000);
        super.maxJumpHeight = (int) Math.round(Math.random ()*2+4);
        super.maxSwimDistance = 0;
    }
}
