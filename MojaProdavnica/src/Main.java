import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String []args){


        char izbor = '\0';
        double ukupanIznos = 0.0;

        Scanner scan = new Scanner(System.in);

        List<Artikl> proizvod = new ArrayList<>();

        do {

            System.out.print("Artikl: ");
            String imeArtikla = scan.nextLine();
            System.out.print("Kolicina: ");
            int kolicina = scan.nextInt();
            System.out.print("Cena: ");
            double cena = scan.nextDouble();

            // cena za jednu vrstu artikla
            double iznos = cena * kolicina;

            // ukupan iznos racuna
             ukupanIznos += iznos;
             
            proizvod.add( new Artikl(
                    imeArtikla, kolicina, cena, iznos) );

            System.out.print("Dodati jos neki artikl? (d ili n): ");

            izbor = scan.next().charAt(0);

            scan.nextLine();
        } while (izbor == 'd' || izbor == 'D');

        Artikl.stavkeRacuna();
        for (Artikl p : proizvod) {
            p.stampajRacun();
        }

        System.out.println("\nUkupan iznos = " + ukupanIznos);

        scan.close();
    }

}

