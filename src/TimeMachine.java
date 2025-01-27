public class TimeMachine {
    private int currentYear;
    private boolean isWorking;

    TimeMachine(boolean isWorking, int currentYear) {
        this.currentYear = currentYear;
        this.isWorking = isWorking;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public Boolean getIsWorking() {
        return isWorking;
    }

    public void travelInTime(TimeTraveler timeTraveler, int travelingYear) throws TimeTravelException {
        if (!isWorking) {
            throw new TimeTravelException("The time machine is not working at the moment.");
        }
        if (travelingYear < timeTraveler.getBirthYear()) {
            throw new TimeTravelException("The year of travel to the past is less than the year of the traveler's birth");
        }
        if(travelingYear > timeTraveler.getDeathYear()){
            throw new TimeTravelException("The year of the travel into the future is longer than the year of the traveler's death");
        }
        System.out.println("Let's travel!");
    }
}

