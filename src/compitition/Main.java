package compitition;

public class Main {

    public static void main(String[] args) {
        Team team1 = new Team ( "Роботы" );
        Course course = new Course ();
        team1.infoAboutTeam ();
        for (int i = 0; i < team1.team.length; i++){
            for (int j = 0; j<course.cr.length; j++){
                course.cr[j].doIt ( team1.team[i] );
                if(!team1.team[i].onDistance) break;
            }
        }
        course.doIt ();
        team1.infoAboutWiners ();
    }
}
