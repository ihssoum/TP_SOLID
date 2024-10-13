import java.util.Map;

public class ImprimerFactureImp implements ImprimerFacture{
    @Override
    public void imprimer(Facture facture) {
        double prix;
        for (Map.Entry mapentry : facture.getProduits().entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * ((Integer)mapentry.getValue());

            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }
}
