import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Abonnement {
  /**ATTRIBUTS*/
  private int numero;
  private String proprietaire;
  private Date dateAchat;
  private ArrayList <Operation> ListeOperation;

  /**CONSTRUCTEURS*/
  public Abonnement(){

  }
  public Abonnement(int numero, String proprietaire, Date dateAchat, ArrayList<Operation> listeOperation) {
      this.numero = numero;
      this.proprietaire = proprietaire;
      this.dateAchat = dateAchat;
      ListeOperation = listeOperation;
  }
  /**GETTER ET SETTER*/
    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}
    public String getProprietaire() {return proprietaire;}
    public void setProprietaire(String proprietaire) {this.proprietaire = proprietaire;}
    public Date getDateAchat() {return dateAchat;}
    public void setDateAchat(Date dateAchat) {this.dateAchat = dateAchat;}
    public ArrayList<Operation> getListeOperation() {return ListeOperation;}

    @Override
    public String toString() {
        return "Abonnement{" +
                "numero=" + numero +
                ", proprietaire='" + proprietaire + '\'' +
                ", dateAchat=" + dateAchat +
                ", ListeOperation=" + ListeOperation +
                '}';
    }
    /** Méthode ajoutant une opéartion à l'ArrayList Operation */
    public void ajouterOperation(Operation nouvelle) { {
      this.ListeOperation.add(nouvelle);
    } }
    /** Méthode affichant les nombreOperations dernières opérations */
    public void historique(int nombreOperations){
      /** parcours de l'ArrayList Operation à l'envers afin de récuperer
       *  les dernières nombreOperations opérations
       */
      for(int i= getListeOperation().size() ;i<(getListeOperation().size()-nombreOperations);i++){
        System.out.println("Abonnement n° : " + i + getListeOperation().get(i).toString());
      }
    }
}


