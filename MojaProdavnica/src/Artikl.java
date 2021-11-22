public class Artikl {

    private String imeArtikla;
    private int kolicina;
    private double cena;
    private double ukupno;

    public Artikl (String ime,int kolicina, double cena,double ukupno ){
        this.imeArtikla=ime;
        this.kolicina=kolicina;
        this.cena=cena;
        this.ukupno=ukupno;
    }

    public String getIme() {
        return imeArtikla;
    }

    public int getKolicina() {
        return kolicina;
    }

    public double getCena() {
        return cena;
    }

    public double getUkupno() {
        return ukupno;
    }

    public static void stavkeRacuna() {
        System.out.print(
                "\nArtikl      Kolicina     Cena     Ukupno\n");
    }


    public void stampajRacun() {
        System.out.format("%-9s %8d %10.2f %10.2f\n",
                imeArtikla, kolicina, cena, ukupno);
    }
}
