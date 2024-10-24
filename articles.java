public class articles extends document {
    private String Nom_auteur;

    public articles(int nbr_pages, String titre, int numero_id,String Nom_auteur) {
        super(nbr_pages, titre, numero_id);
        this.Nom_auteur=Nom_auteur;
    }

    public void setNomAuteur(String nom){
        this.Nom_auteur=nom;
    }
    public String getnomAuteur(){
        return Nom_auteur;
    }
   
    public void edition(){
        super.edition();
        System.out.println("le nom d'auteur:"+getnomAuteur());
        System.out.println("type:Articles");
    }

    
}
