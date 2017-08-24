package compitition;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team implements AbilityToSport{
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
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        for(int i = 0;i <team.length; i++){
            random = (int) Math.round(Math.random ());
            if (random == 0){
                System.out.println ("Введите имя " + countOfMembers+ "-го члена команды " + name + " кота:" );
                team[i] = new Cat ();
                try {
                    team[i].name=in.readLine ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
                countOfMembers++;
            }else{
                System.out.println ("Введите имя " + countOfMembers + "-го члена команды " + name + " собаки:" );
                team[i] = new Dog ();
                try {
                    team[i].name=in.readLine ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
                countOfMembers++;
            }
        }
    }
    public void printResult(){
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
            System.out.println (this.team[i].type + " по имени: " + this.team[i].name + ", может пробежать: " + this.team[i].maxRunDistance + "м, может проплыть: " + this.team[i].maxSwimDistance + "м, может перепрыгнуть: "+ this.team[i].maxJumpHeight + "м");
        }
    }
// как в методах сделать System.out.println ( team[i].type + " " + team[i].name + " пробежал дистанцию длинной" cr[i].lenght );
// не создавая объект тут Course cr
Course course = new Course ();
    @Override
    public void run(int distance) {
        for(int i = 0;i <team.length; i++) {
            if (distance <= team[i].maxRunDistance) {
                System.out.println ( team[i].type + " " + team[i].name + " пробежал дистанцию");
            } else {
                team[i].onDistance = false;
                System.out.println ( team[i].type + " " + team[i].name + " не пробежал дистанцию" );
            }
        }
    }

    @Override
    public void swim(int distance) {
        for(int i = 0;i <team.length; i++) {
            if (team[i].maxSwimDistance == 0) {
                System.out.println ( team[i].type + " " + team[i].name + " не умеет плавать" );
            }
            if (distance <= team[i].maxSwimDistance) {
                System.out.println ( team[i].type + " " + team[i].name + " переплыл дистанцию" );
            } else {
                team[i].onDistance = false;
                System.out.println ( team[i].type + " " + team[i].name + " не переплыл дистанцию" );
            }
        }
    }

    @Override
    public void jump(int height) {
        for(int i = 0;i <team.length; i++){
        if(height<=team[i].maxJumpHeight){
            System.out.println (team[i].type + " " + team[i].name + " перепрыгнул препятствие");
        }else{
            team[i].onDistance = false;
            System.out.println (team[i].type + " " + team[i].name + " не перепрыгнул препятствие");
        }
            }
    }
}
