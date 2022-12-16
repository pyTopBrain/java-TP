import java.util.Random;
import java.util.Scanner;

public class Exo4TP1 {
    public static void main(String[] args) {
        int inf=0;
        int sup=100;
        boolean exact=false;
        int nbr=1;
        System.out.println("Veuillez Devinez un nombre entier entre 0 et 100");
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Est-ce "+nbr+" ?");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("plus")){
                inf=nbr;
                nbr=new Random().ints(inf,sup).findAny().getAsInt();
            }
            else if (s.equalsIgnoreCase("moins")){
                sup=nbr;
                nbr=new Random().ints(inf,sup).findAny().getAsInt();
            }
            else exact=true;

        }
        while (!exact);
        System.out.println("Le nombre exact est "+nbr);
        sc.close();
    }
}
