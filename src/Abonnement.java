import java.util.ArrayList;
import java.util.Calendar;

public class Abonnement {
  /**ATTRIBUTS*/
  private int numero;
  private String proprietaire;
  private Calendar dateAchat;
  private ArrayList <Operation> ListeOperation;

  /**CONSTRUCTEURS*/
  public Abonnement(){

  }
  public Abonnement(int numero, String proprietaire, Calendar dateAchat, ArrayList<Operation> listeOperation) {
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
    public Calendar getDateAchat() {return dateAchat;}
    public void setDateAchat(Calendar dateAchat) {this.dateAchat = dateAchat;}
    public ArrayList<Operation> getListeOperation() {return ListeOperation;}
    public void setListeOperation(ArrayList<Operation> listeOperation) {ListeOperation = listeOperation;}

  /**AFFICHAGE*/
    @Override
    public String toString() {
        return "Abonnement{" +
                "numero=" + numero +
                ", proprietaire='" + proprietaire + '\'' +
                ", jour de l'achat =" + dateAchat.get(Calendar.DAY_OF_MONTH) + /*************************/
                ", ListeOperation=" + ListeOperation +
                '}';
    }
    /**METHODES*/
    /**méthode permettant d'ajouter une operation a l'arrayliste*/
    public void ajouterOperation(Operation nouvelle) {
    this.ListeOperation.add(nouvelle);
    }
    /** Méthode affichant les nombreOperations dernières opérations */
    public void historique(int nombreOperations){
      /** parcours de l'ArrayList Operation à l'envers
       * afin de récuperer les dernières nombreOperations
       * opérations
       */
      for(int i= getListeOperation().size() ;i<(getListeOperation().size()-nombreOperations);i++){
        System.out.println("Abonnement n° : " + i + getListeOperation().get(i).toString());
      }
    }
  }


