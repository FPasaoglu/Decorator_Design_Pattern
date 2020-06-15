import java.util.ArrayList;

public class Apollo2 implements IApollo{

    private ArrayList<String> pets;

    Apollo2() {

    }

    @Override
    public double getSpeed() {
        // km/hr
        return 12747;
    }

    @Override
    public boolean withHuman() {
        return false;
    }

    @Override
    public String getSpaceShuttle() {
        return "SaturnIB";
    }

    @Override
    public ArrayList<String> getCrew() {
        return pets;
    }

    @Override
    public void liftOff() {
        System.out.println("^\n" + "|\n" + "|\n" + "|\n" +".\n" +".   3 2 1 Lift Off " );
    }


}
