import java.util.ArrayList;
import java.util.Calendar;

public class AbonnementSeance extends Abonnement{
    /**ATTRIBUTS*/
    int nombreSeance;
    /**CONSTRUCTEURS*/
    public AbonnementSeance(int numero, String proprietaire, Calendar dateAchat, ArrayList<Operation> listeOperation, int nombreSeance) {
        super(numero, proprietaire, dateAchat, listeOperation);
        this.nombreSeance = nombreSeance;
    }
    /**GETTER ET SETTER*/
    public int getNombreSeance() {return nombreSeance;}
    public void setNombreSeance(int nombreSeance) {this.nombreSeance = nombreSeance;}

    @Override
    public String toString() {
        return "AbonnementSeance{" +
                "nombreSeance=" + nombreSeance +
                '}';
    }
    /** méthode chargement de l'abonnement en fonction du nb de séances rentré */
    public void chargerAbonnementSeance(int nbSeance){
        this.nombreSeance= nbSeance;
    }

    public boolean valider(Calendar seance, int heure, int minute){
        Operation op = new Operation();
        if(getNombreSeance()>0){//superieur a mois debut mais inferieur à mois fin
            op.setDate(seance);
            op.setHeure(heure);
            op.setMinute(minute);
            ajouterOperation(op);
            return true;
        }else{
            return false;
        }
    }

}
