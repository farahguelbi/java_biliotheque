
public class bibliotheque {
   private  document[] listdoc;
        private int Nombredoc;
    private int capacite;
    public bibliotheque( int capacite){
        this.capacite=capacite;
        this.listdoc=new document[capacite];
        this.Nombredoc=0;
    }
    int getCapacite(){
        return capacite;

    }
    public int getNombredoc() {
        return Nombredoc;
    }
    public void ajout_doc(document d){
        if(getNombredoc()<capacite){
        listdoc[Nombredoc]=d;
        Nombredoc++;
        trier();
        }else{
            System.out.println("capacité atteinte!!");
        }

    }
    public void trier(){
      for(int i=0;i<getNombredoc();i++){
        for(int j=0;j<getNombredoc()-1;j++){
          if(listdoc[i].getnumero()>listdoc[j].getnumero()) {
            document x=listdoc[j];
            listdoc[j]=listdoc[i];
            listdoc[i]=x;
          }               
            
        }

      }
    }
    public void Supprime_doc(int num ){
        boolean found=false;
        for (int i=0 ;i<getNombredoc(); i++){
            if(listdoc[i].getnumero()==num){
                found=true;
            }
            for (int j = i; j < Nombredoc - 1; j++) {
                listdoc[j] = listdoc[j + 1];
            }
            listdoc[Nombredoc - 1] = null; 
            Nombredoc--;                  
            System.out.println("Document avec numéro d'identification " + num + " supprimé.");
            break;
        }
    
    if (!found) {
        System.out.println("Document non trouvé.");
    }}
    void inventaire_Doc(){
        if(Nombredoc==0){
        System.out.println("la liste est vide !");

        }else{
        for(int i=0;i<Nombredoc;i++){
            System.out.println("************");
            listdoc[i].edition();
            System.out.println("*********************************");
        }
        }
        }
    public bibliotheque liste_livre() {
        bibliotheque listlivre = new bibliotheque(capacite); 
        for (int i = 0; i < Nombredoc; i++) {
            if (listdoc[i] instanceof livre) { 
                listlivre.ajout_doc(listdoc[i]); 
            }
        }
        return listlivre; 
    }
    public bibliotheque liste_article() {
        bibliotheque liste_articles=new bibliotheque(capacite);
        for(int i=0;i<Nombredoc;i++){
            if(listdoc[i]instanceof articles){
        liste_articles.ajout_doc(listdoc[i]);
    }
            } return liste_articles;
    }
   public  bibliotheque liste_periodique(){
          bibliotheque liste_periodique=new bibliotheque(capacite);
    for(int i=0;i<Nombredoc;i++){
        if(listdoc[i]instanceof periodiques){
           liste_periodique.ajout_doc(listdoc[i]);
       }
    } return liste_periodique;
    
}
}

