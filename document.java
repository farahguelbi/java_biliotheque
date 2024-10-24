
public class document {
    private String titre;
    private int numero_id;
    private int nbr_pages;
    public document(int nbr_pages,String titre,int numero_id){
        this.nbr_pages=nbr_pages;
        this.titre=titre;
       this.numero_id=numero_id;

    }
   public void setTitre(String titre){
    this.titre=titre;

   }
   public void setNumero(int num){
    this.numero_id=num;
   }
   public void setnbrpage(int nb){
    this.nbr_pages=nb;
   }
   public String getTitre(){
    return titre;
   }
   public int getnumero(){
    return numero_id;
   }
   public int getnbr_pages(){
    return nbr_pages;
   }

   
public void edition(){
    System.out.println("le titre est :"+getTitre());
    System.out.println("le numero d'identification est :"
    +getnumero());
    System.out.println("le nombres de pages est :"+getnbr_pages());
System.out.println("type:Document");
}
}