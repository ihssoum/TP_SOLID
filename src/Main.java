public class Main {
    public static void main(String[] args) {

        CreerFacture creerFacture=new CreerFactureImp();
        ImprimerFacture imprimerFacture=new ImprimerFactureImp();
        Produit produit1=new Produit("produit1",150);
        Produit produit2=new Produit("produit2",350);
        Facture facture1= new Facture(1);
        Facture.setTVA(0.2);
        facture1.addProduit(produit1,3);
        facture1.addProduit(produit2,1);
        creerFacture.saveFacture(facture1);
        imprimerFacture.imprimer(facture1);
    }
}