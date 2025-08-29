import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Collections = HashSet et TreeSet");

    HashSet<Patient> ens1Patients = new HashSet<Patient>();
    ens1Patients.add(new Patient("Dupont", "Jean", 1.72, 65));
    ens1Patients.add(new Patient("Durand", "Leon", 1.78, 85));

    HashSet<Patient> ens2Patients = new HashSet<Patient>();
    ens2Patients.add(new Patient("Dubarry", "Paul", 1.83, 92));
    ens2Patients.add(new Patient("Durand", "Leon", 1.78, 85));

    // -- afficher les patients de l'ensemble 1
    System.out.println("--> ens1 : ");

    // -- calcul du poids moyen
    System.out.println("poids moyen : ");

    // -- ajout d'un patient pas présent
    System.out.println("--> ajout fait : ");
    System.out.println("--> ens1 : ");

    // -- ajout d'un patient déjà présent
    System.out.println("--> ajout fait : ");
    System.out.println("--> ens1 : ");

    // -- supprimer un patient présent dans l'ens
    System.out.println("--> supp fait : ");
    System.out.println("--> ens1 : ");

    // -- supprimer un patient pas présent dans l'ens
    System.out.println("--> supp fait : ");
    System.out.println("--> ens1 : ");

    // -- suppresion des patients < à une taille données
    System.out.println("--> ens1 : ");

    // -- créer un ens contenant les "Leon"
    System.out.println("--> ens des 'Leon' : ");


    // --- union, intersection, difference
    System.out.println("\n--> UNION / INTERSECTION / DIFFERENCE : ");
    System.out.println("--> ens1 : ");

    System.out.println("--> ens2 : ");

    // -- union
    System.out.println("--> union :");

    // -- intersection
    System.out.println("--> intersection :");

    // -- différence
    System.out.println("--> différence e1-e2 :");

    System.out.println("--> différence e2-e1 :");


    // --- ensembles ordonnés TreeSet
    System.out.println("--> Ensemble ordonné : ");
    TreeSet<Patient> ens3Patients = new TreeSet<Patient>();
    ens3Patients.add(new Patient("Dubarry", "Paul", 1.83, 92));
    ens3Patients.add(new Patient("Durand", "Leon", 1.78, 85));
    ens3Patients.add(new Patient("Dupont", "Leon", 1.99, 85));
    
    System.out.println("ens3 : ");

  }

  /*
   * Affichage des patients
   * données : 
   * résultat : 
   */
 

  /*
   * Calcul du poids moyen
   * données : 
   * résultats : 
   */


  /*
   * Ajouter un patient dans un ens de patients
   * données : 
   * résultats : 
   */


  /*
   * Supprimer un patient dans un ens de patients
   * données : 
   * résultats : 
   */


  /*
   * Supprimer des patients ayant une taille inférieure à un valeur donnée
   * données : 
   * résultats : 
   */


  /*
   * Créer une liste des patients portant un prénom donné
   * données : 
   * résultats : 
   */


  /*
   * Union de 2 ens de patients
   * données : 
   * résultats : 
   */


  /*
   * Intersection de 2 ens de patients
   * données : 
   * résultats : 
   */


  /*
   * Différence de 2 ens de patients
   * données : 
   * résultats : 
   */


  // ======= TreeSet

  /*
   * Afficher un treeset de Patients
   * données : 
   * résultat : 
   */

}