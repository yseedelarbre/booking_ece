import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AbonnementDuree extends Abonnement {
    /**ATTRIBUTS*/
    private Calendar date_debut;
    private Calendar date_fin;
    private boolean active;

    /**CONSTRUCTEURS*/
    public AbonnementDuree(int numero, String proprietaire, Date dateAchat, ArrayList<Operation> listeOperation, Calendar date_debut, Calendar date_fin, boolean active) {
        super(numero, proprietaire, dateAchat, listeOperation);
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.active = active;
    }
    /**GETTER ET SETTER*/
    public Calendar getDate_debut() {return date_debut;}
    public void setDate_debut(Calendar date_debut) {this.date_debut = date_debut;}
    public Calendar getDate_fin() {return date_fin;}
    public void setDate_fin(Calendar date_fin) {this.date_fin = date_fin;}
    public boolean isActive() {return active;}
    public void setActive(boolean active) {this.active = active;}
    /**AFFICHAGE*/
    @Override
    public String toString() {
        return "AbonnementDuree{" +
                "date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                ", active=" + active +
                '}';
    }

    /** méthode de chargement de l'abonnement en fonction du la date début
     * et de date de fin */
    public void chargerAbonnementDuree(Calendar debut, Calendar fin){
        this.date_debut= debut;
        this.date_fin= fin;
        this.active = true;
    }
}
