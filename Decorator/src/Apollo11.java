import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Apollo11 extends Decorator {

    private String newCrew;
    private ArrayList<String> crew ;
    Apollo11(IApollo apollo, String c1 ) {
        super(apollo);
        crew = new ArrayList<>();
        this.newCrew = c1;
    }

    @Override
    public double getSpeed() {
        // Apollo 11 is faster than Apollo 1
        return super.getSpeed() + 300;
    }

    @Override
    public boolean withHuman() {
        return super.withHuman();
    }

    @Override
    public String getSpaceShuttle() {
        return super.getSpaceShuttle();
    }

    @Override
    public ArrayList<String> getCrew() {
         super.getCrew().add(newCrew);
         return super.getCrew();
    }

    @Override
    public void liftOff() {
        super.liftOff();
        sendToMoon();
    }

    public void sendToMoon(){
        System.out.println("One small steps for man, one giant leap for mankind ");
    }
}

