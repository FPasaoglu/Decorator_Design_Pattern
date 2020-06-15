public class NASA {

    public static void main(String[] args){

        IApollo apollo1 = new Apollo1("Aldrin","Collins");
        IApollo apollo11 =  new Apollo11( new Apollo1("Aldrin","Collins"),"Armstong");
        IApollo apollo17 = new Apollo17(new Apollo11(new Apollo1("Duke","Schmit"),"Evans"),"Diamond");
        IApollo apollo2 = new Apollo17(new Apollo2(),"Gold");




        System.out.println("Apollo 1 ");
        System.out.println("-------------------");
        spaceFeatures(apollo1);
        System.out.println("-------------------");

        System.out.println("Apollo 11");
        System.out.println("-------------------");
        spaceFeatures(apollo11);
        System.out.println("-------------------");

        System.out.println("Apollo 17");
        System.out.println("-------------------");
        spaceFeatures(apollo17);
        System.out.println("-------------------");

        System.out.println("Apollo 2");
        System.out.println("-------------------");
        spaceFeatures(apollo2);
        System.out.println("-------------------");


        apollo11.liftOff();


    }

    public static void spaceFeatures(IApollo apollo){
        System.out.println("Speed : " + apollo.getSpeed());
        System.out.println("Crew : " + apollo.getCrew());
        System.out.println("Space Shuttle : " + apollo.getSpaceShuttle());
    }


}
