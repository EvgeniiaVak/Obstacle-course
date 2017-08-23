package compitition;

import java.util.Scanner;

public class Cat extends Animal{
    public Cat(){
        this.type = "Кот";
        super.maxRunDistance = 1000 ;
        super.maxJumpHeight = 5;
        super.maxSwimDistance = 0;
    }
}
