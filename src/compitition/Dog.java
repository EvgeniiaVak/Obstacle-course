package compitition;

import java.util.Scanner;

public class Dog extends Animal{
    public Dog(){
        this.type = "Собака";
        super.maxRunDistance = 2000 ;
        super.maxJumpHeight = 2;
        super.maxSwimDistance = 20;
    }
}
