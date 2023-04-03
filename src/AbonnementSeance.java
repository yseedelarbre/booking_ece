import java.util.ArrayList;
import java.util.Calendar;

public class AbonnementSeance extends Abonnement{
    /**ATTRIBUTS*/
    int nombreSeance;
    /**CONSTRUCTEURS*/

    public AbonnementSeance(int numero, String proprietaire, Date dateAchat, ArrayList<Operation> listeOperation, int nombreSeance) {
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
    /**méthode qui valide une opération et qui l'ajoute à l'historique si elle est validee*/
    public boolean valider(Abonnement historique, Calendar seance, int heure, int minute){
        Operation op = new Operation();
        if(getNombreSeance()>0 ){ /**Si l'abonnement contient encore des seances*/
            op.setDate(seance);
            op.setHeure(heure);
            op.setMinute(minute);
            historique.ajouterOperation(op); /**Ajoute l'abonnement à l'historique*/
            int a = getNombreSeance();
            setNombreSeance(a-1); /**on retire une seance à l'abonnement*/
            return true;
        }else{
            return false;
        }
    }
}
