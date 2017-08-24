package compitition;

public class Main {

    public static void main(String[] args) {
        Team team1 = new Team ( "Роботы" );
        //Team team2 = new Team("Овощи");
        // при создании 2й команды имя team[i].name в конструкторе класса Team обращается в null не давая возможности ввести имя
        // членам команды номер2 почему????
        Course course = new Course ();
        team1.infoAboutTeam ();
        course.doIt (team1);
        team1.printResult ();
        /*team2.infoAboutTeam ();
        course.doIt (team2);
        team2.printResult ();*/
    }
}
