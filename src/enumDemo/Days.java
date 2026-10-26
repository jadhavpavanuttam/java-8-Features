package enumDemo;

public enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    private String lower;
    public void displayDays() {
        System.out.println("today is : "+this.name().toLowerCase());
    }
    }
/**
 * Internal working :-
 *
 */