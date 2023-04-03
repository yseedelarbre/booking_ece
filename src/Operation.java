import java.util.Calendar;

public class Operation {

    /** attributs */
    private Calendar date;
    private int heure ;
    private int minute;

    public int getHeure() {
        return heure;
    }

    /** constructeur */
    public Operation(Calendar date, int heure, int minute) {
        this.date = date;
        this.heure = heure;
        this.minute = minute;
    }

/** getter et setter */
    public void setHeure(int heure) {
        this.heure = heure;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date=" + date +
                ", heure=" + heure +
                ", minute=" + minute +
                '}';
    }

}
