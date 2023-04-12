
public class Complexe {
    private double partieReelle;
    private double partieImaginaire;

    public Complexe() {
    }

    public Complexe(double partieReelle, double partieImaginaire) {
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }
    public Complexe(Complexe complexe) {
        this.partieReelle=complexe.partieReelle;
        this.partieImaginaire=complexe.partieImaginaire;
    }

    public double getPartieReelle() {
        return partieReelle;
    }

    public void setPartieReelle(double partieReelle) {
        this.partieReelle = partieReelle;
    }

    public double getPartieImaginaire() {
        return partieImaginaire;
    }

    public void setPartieImaginaire(double partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }

    public static Complexe ajouter(Complexe complexe1,Complexe complexe2){
        return new Complexe(complexe1.getPartieReelle()+complexe2.getPartieReelle(),
                complexe1.getPartieImaginaire()+complexe2.getPartieImaginaire());
    }
    public static Complexe soustraire(Complexe complexe1,Complexe complexe2){
        return new Complexe(complexe1.getPartieReelle()-complexe2.getPartieReelle(),
                complexe1.getPartieImaginaire()-complexe2.getPartieImaginaire());
    }

    @Override
    public String toString() {
        return this.partieImaginaire>0?
                partieReelle + "+" + partieImaginaire+"i" :
                partieReelle + "" + partieImaginaire+"i";

    }

}
