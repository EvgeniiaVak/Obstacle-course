package compitition;

public class Course extends Team{// как передать team.length без наследования?
    Obstance cr[];
    public Course (){
        //super(); не хочет писаться nameOfTeam и team[] почему?
        cr = new Obstance[] {new Cross ( 500 ), new Wall ( 2 ), new Water ( 5 ), new Cross ( 800 ) };
    }

    public void doIt(){
        for (int i = 0; i < team.length; i++){//java.lang.NullPointerException почему?
            for (int j = 0; j<cr.length; j++){
                cr[j].doIt ( team[i] );
                if(!team[i].onDistance) break;
            }
        }
    }
}
