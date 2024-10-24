public class livre extends articles {
    private String nomdeediteur;
    public livre(int nbr_pages, String titre, int numero_id, String Nom_auteur,String nomed) {
        super(nbr_pages, titre, numero_id, Nom_auteur);
        this.nomdeediteur=nomed;
    }
    public void setNomediteur(String nom){
        this.nomdeediteur=nom;
    }
    public String getnomEditeur(){
        return nomdeediteur;
    }
    public void edition(){
        super.edition();
        System.out.println("le nom d'editeur:"+getnomEditeur());
        System.out.println("type:Livre");
    }
    
}
