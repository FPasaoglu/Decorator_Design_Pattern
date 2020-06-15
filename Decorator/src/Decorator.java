import java.util.ArrayList;

public abstract class Decorator implements IApollo{
    IApollo apollo;

    Decorator(IApollo apollo){
        this.apollo = apollo;
    }

    public double getSpeed() {
        return apollo.getSpeed();
    }


    public boolean withHuman() {
        return apollo.withHuman();
    }


    public String getSpaceShuttle() {
        return apollo.getSpaceShuttle();
    }

    public void liftOff() { apollo.liftOff(); }

    public ArrayList<String> getCrew() {
        return apollo.getCrew();
    }


}
