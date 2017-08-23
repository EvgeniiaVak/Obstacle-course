package compitition;
import java.util.Scanner;

public class Team {
    protected String nameOfTeam;
    Animal team[] = new Animal[4];;
    static int countOfMembers;

   public Team () {
    }

    public  Team(String name){
        countOfMembers = 1;
        this.nameOfTeam = name;
        //this.team = new Animal[4];
        int random;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i <team.length; i++){
            random = (int) Math.round(Math.random ());
            if (random == 0){
                System.out.println ("Введите имя " + countOfMembers + "-го члена команды " + name + " кота:" );
                team[i] = new Cat ();
                team[i].name=sc.nextLine ();
                countOfMembers++;
            }else{
                System.out.println ("Введите имя " + countOfMembers + "-го члена команды " + name + " собаки:" );
                team[i] = new Dog ();
                team[i].name=sc.nextLine ();
                countOfMembers++;
            }
        }
        sc.close ();
    }
    public void infoAboutWiners (){
        System.out.println ("Полосу препятствий из команды " + this.nameOfTeam + " прошли:");
        for(int i = 0;i <team.length; i++){
            if (this.team[i].onDistance){
                System.out.println (this.team[i].type + " по имени: " + this.team[i].name);
            }
        }
        if (!this.team[0].onDistance && !this.team[1].onDistance && !this.team[2].onDistance && !this.team[3].onDistance)
            System.out.println ("Полосу препятствий никто не прошел");
    }
    public void infoAboutTeam(){
        System.out.println ("Состав команды " + this.nameOfTeam + ":");
        for(int i = 0;i <team.length; i++){
            System.out.println (this.team[i].type + " по имени: " + this.team[i].name);
        }
    }
}
