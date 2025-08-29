  public class Patient implements Comparable<Patient> {
  // -- attributs
  private String nom;
  private String prenom;
  private double taille;
  private int poids;

  // -- constructeur
  public Patient(String nom, String prenom, double taille, int poids) {
    this.nom = nom;
    this.prenom = prenom;
    this.taille = taille;
    this.poids = poids;
  }

  // -- getters
  public String getNom() {
    return nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public double getTaille() {
    return taille;
  }

  public int getPoids() {
    return poids;
  }

  // -- conversion en string
  public String toString() {
    return nom + " " + prenom + " ( taille : " + taille + " poids : " + poids + " )";
  }

  // -- fonction de hash : necessaire pour les HashSet
  @Override
  public int hashCode() {
    return nom.hashCode() * prenom.hashCode() * (int) (taille * 100);
  }

  // -- méthode permettant de définir
  // comment on considere que 2 patients sont identiques
  @Override
  public boolean equals(Object obj) {
    // le param ne doit pas être null
    if (obj == null)
      return false;
    // le param doit être une instance de la classe Patient
    if (!(obj instanceof Patient))
      return false;

    Patient other = (Patient) obj;
    // 2 patients identiques si même nom, prenom, taille et poids
    return (this.nom != null ? this.nom.equals(other.nom) : this.nom == other.nom)
        && (this.prenom != null ? this.prenom.equals(other.prenom) : this.prenom == other.prenom)
        && (this.taille == other.taille) && (this.poids == other.poids);
  }

  // -- méthode permettant de définir le critère de tri
  // entre 2 patients
  public int compareTo(Patient p) {
    // plusieurs critères de tri possible


    // par taille
    int res = 0;
    if (taille < p.taille)
      res = -1;
    else if (taille > p.taille)
      res = 1;
    return res;
  }
}