public class periodiques extends document {
  private String frequence_de_parution;
    public periodiques(int nbr_pages, String titre, int numero_id,String frequence) {
        super(nbr_pages, titre, numero_id);
        this.frequence_de_parution=frequence;
    }
    public void setfrequence (String frequnce){
        this.frequence_de_parution=frequnce;
    }
    public String getfrequence(){
        return frequence_de_parution;
    }
   
    public void edition(){
        super.edition();
        System.out.println("fréquence de parution.:"+getfrequence());
        System.out.println("type :periodiques ");
    }
    
}
