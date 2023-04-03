import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Operation> historiqueOperation = new ArrayList<>();
        System.out.println("Bonjour et bienvenue sur la plateforme d'abonnement");
        System.out.println("***************************************************");
        System.out.println("Voulez-vous créer un abonnement : ");
        System.out.println("1 : Abonnement séance ");
        System.out.println("2 : Abonnement durée");

        Scanner scan= new Scanner(System.in); //variable de scan
        int r=scan.nextInt(); //récupération du nombre saisie
        while(r>2 && r<0){
            System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
            r=scan.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
        }

        /** début de la création de l'abonnement */
        System.out.println("Votre nom  : ");
        Scanner scan3= new Scanner(System.in); //variable de scan
        String name=scan3.nextLine(); //récupération du nombre saisie
        System.out.println("Votre numero  de téléphone : ");
        Scanner scanner= new Scanner(System.in); //variable de scan
        int num=scanner.nextInt(); //récupération du nombre saisie
        while( num<0){
            System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
            num=scanner.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
        }

        /** L'utilisateur souhaite créer un abonnement seance*/
       if(r==1)
       {
           System.out.println("Combien de séances souhaitez-vous mettre sur votre abonnement ? ");
           Scanner scan2= new Scanner(System.in); //variable de scan
           int nbSeance=scan2.nextInt(); //récupération du nombre saisie
           while( nbSeance<0){
               System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
               nbSeance=scan2.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
           }
           /** récupération de la date actuelle */
           Long millis = System.currentTimeMillis();
           Date date = new Date(millis);
           /** création de l'abonnement */
           AbonnementSeance abonnement = new AbonnementSeance(num,name,date,historiqueOperation,nbSeance);
           abonnement.chargerAbonnementSeance(nbSeance);

           /** validation d'une opération et ajout à l'historique des opérations */

           System.out.println("Veuillez rentrer une date de séance  : ");
           System.out.println("Jour  : ");
           Scanner scan4= new Scanner(System.in); //variable de scan
           int jour=scan4.nextInt(); //récupération du nombre saisie
           while( jour<0){
               System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
               jour=scan4.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
           }
           System.out.println("Mois   : ");
           Scanner scan5= new Scanner(System.in); //variable de scan
           int mois=scan5.nextInt(); //récupération du nombre saisie
           while( mois<0){
               System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
               mois=scan5.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
           }
           System.out.println("Année  : ");
           Scanner scan6= new Scanner(System.in); //variable de scan
           int annee=scan6.nextInt(); //récupération du nombre saisie
           while( annee<0){
               System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
               annee=scan6.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
           }

           System.out.println("Veuillez rentrer une horaire de séance  : ");
           System.out.println("Heure  : ");
           Scanner scan7= new Scanner(System.in); //variable de scan
           int heure=scan7.nextInt(); //récupération du nombre saisie
           while( heure<0){
               System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
               heure=scan7.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
           }
           System.out.println("Minutes   : ");
           Scanner scan8= new Scanner(System.in); //variable de scan
           int minute=scan8.nextInt(); //récupération du nombre saisie
           while( minute<0){
               System.out.println("Erreur de saisie, veuillez saisir un nombre supérieur ou égale à 1 : ");
               minute=scan8.nextInt(); //récupération du nombre saisie si la saisie était incorrecte
           }
           /** récuperation et conversion en formate Calendar*/
           Calendar dateSeance = new GregorianCalendar(annee,mois-1,jour);
           abonnement.valider(dateSeance,heure,minute);

       }
       else if(r==2)
       {

       }
    }
}