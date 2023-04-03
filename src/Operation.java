import java.util.Calendar;

public class Operation {

    /** ATTRIBUTS */
    private Calendar date; /**permet d'avoir les dates avec jour, mois, année*/
    private int heure ;
    private int minute;

    /** CONSTRUCTEURS */
    public Operation(){} /**constructeur par défaut*/
    public Operation(Calendar date, int heure, int minute) { /**constructeur surchargé*/
        this.date = date;
        this.heure = heure;
        this.minute = minute;
    }

    /** GETTERS ET SETTERS */
    public int getHeure() {return heure;}
    public void setHeure(int heure) {this.heure = heure;}
    public int getMinute() {return minute;}
    public void setMinute(int minute) {this.minute = minute;}
    public Calendar getDate() {return date;}
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**AFFICHAGE*/
    @Override
    public String toString() {
        return "Operation{" +
                ", jour de l'achat =" + date.get(Calendar.DAY_OF_MONTH) +
                ", mois de l'achat =" + date.get(Calendar.MONTH + 1) + //on rajoute un car les mois commencent à 0 donc il faut décaler d'un pour avoir le bon mois
                ", année de l'achat =" + date.get(Calendar.YEAR) +
                ", heure=" + heure +
                ", minute=" + minute +
                '}';
    }

}
