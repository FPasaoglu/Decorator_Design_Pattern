import java.sql.Array;
import java.util.ArrayList;

public class Apollo1 implements IApollo{

    private ArrayList<String> crew;

    Apollo1(String c1 , String c2) {
        crew = new ArrayList<>();
        crew.add(c1);
        crew.add(c2);
    }

    @Override
    public double getSpeed() {
        // km/hr
        return 2980;
    }

    @Override
    public boolean withHuman() {
        return true;
    }

    @Override
    public String getSpaceShuttle() {
        return "SaturnV";
    }

    @Override
    public ArrayList<String> getCrew() {
        return crew;
    }

    @Override
    public void liftOff() {
        System.out.println("^\n" + "|\n" + "|\n" + "|\n" +".\n" +".   3 2 1 Lift Off " );
    }


}
