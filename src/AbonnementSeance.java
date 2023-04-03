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
}
