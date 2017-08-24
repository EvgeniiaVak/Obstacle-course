package compitition;

public class Course{
    Obstance cr[];
    public Course (){
        cr = new Obstance[] {new Cross ( 500 ), new Wall ( 2 ), new Water ( 5 ) };
    }
    public void doIt(Team team){
        for (int i = 0; i < cr.length; i++ ){
            cr[i].doIt ( team );
        }
    }
}
