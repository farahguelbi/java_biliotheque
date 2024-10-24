public class test_bibliotheque {
 public static void main(String[] args) {
    bibliotheque mabiblio=new bibliotheque(10);
    document livre1 = new livre(300, "Java pour les débutants", 1, "Jean Dupont", "Éditions Alpha");
    document livre2 = new livre(400, "Python avancé", 2, "Marie Curie", "Éditions Beta");
    document article1 = new articles(15, "L'impact de la technologie sur l'éducation", 3, "Pierre Martin");
    document article2 = new articles(10, "Les tendances de l'intelligence artificielle", 4, "Sophie Durant");
    document periodique1 = new periodiques(100, "Science Mag", 5, "Mensuel");
    document periodique2 = new periodiques(80, "Tech Today", 6, "Hebdomadaire");    
  
    mabiblio.ajout_doc(livre1);
    mabiblio.ajout_doc(livre2);
    mabiblio.ajout_doc(article1);
    mabiblio.ajout_doc(article2);
    mabiblio.ajout_doc(periodique1);
    mabiblio.ajout_doc(periodique2);
    System.out.println("************************************");
    System.out.println("l'interventaire de la bibliotheque :");
    mabiblio.inventaire_Doc();
    System.out.println("************************");
    mabiblio.Supprime_doc(5); 
    System.out.println("************************");
    System.out.println(" après suppression :");
    mabiblio.inventaire_Doc();
    System.out.println("******************************");
    System.out.println("Liste des livres :");
    bibliotheque livres = mabiblio.liste_livre();
    livres.inventaire_Doc();
    System.out.println("Liste des articles :");
    bibliotheque articles = mabiblio.liste_article();
    articles.inventaire_Doc();

    // Lister uniquement les périodiques
    System.out.println("Liste des périodiques :");
    bibliotheque periodiques = mabiblio.liste_periodique();
    periodiques.inventaire_Doc();
}
}

