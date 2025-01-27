public class Main {
    public static void main(String[] args) {
        TimeMachine timeMachine1 = new TimeMachine(false, 2023);
        TimeMachine timeMachine2 = new TimeMachine(true, 2023);

        TimeTraveler timeTraveler1 = new TimeTraveler("Semen", 2000, 2088);
        TimeTraveler timeTraveler2 = new TimeTraveler("Justin", 1990, 2050);
        TimeTraveler timeTraveler3 = new TimeTraveler("Garold", 2010, 2099);
        try {
//            timeMachine1.travelInTime(timeTraveler1, 2010);
//            timeMachine2.travelInTime(timeTraveler1, 2010);
        timeMachine2.travelInTime(timeTraveler2, 1900);
//        timeMachine2.travelInTime(timeTraveler3, 2100);
        } catch (TimeTravelException e) {
            System.out.println(e.getMessage());
        }

    }
}
