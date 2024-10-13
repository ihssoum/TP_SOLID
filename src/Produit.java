public class Produit {
    private String libele;
    private double prix;

    public Produit() {
    }

    public Produit(String libele,double prix) {
        this.libele = libele;
        this.prix=prix;
    }

    public String getLibele() {
        return libele;
    }

    public double getPrix() {
        return prix;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "libele='" + libele + '\'' +
                ", prix=" + prix +
                '}';
    }
}

