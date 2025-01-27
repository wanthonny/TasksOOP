

public class TimeTraveler {
    private String name;
    private int birthYear;
    private int deathYear;

    TimeTraveler(String name1, int birthYear1, int deathYear1) {
        this.name = name1;
        this.birthYear = birthYear1;
        this.deathYear = deathYear1;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }
}
