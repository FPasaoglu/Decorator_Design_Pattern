import java.util.ArrayList;

public class Apollo17 extends Decorator {

    String searchMoonStone;

    Apollo17(IApollo apollo , String searchMoonStone) {
        super(apollo);
        this.searchMoonStone = searchMoonStone;
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
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
    public void liftOff() {
        super.liftOff();
        LunarModule();
    }

    @Override
    public ArrayList<String> getCrew() {
        return super.getCrew();
    }

    public void LunarModule(){
        System.out.println("Searching " + searchMoonStone);
    }
}
