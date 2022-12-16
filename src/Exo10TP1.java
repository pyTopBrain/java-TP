import java.util.Scanner;

public class Exo10TP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier N");
        try {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int mArth=0;
            int mGeo=0;
            
            System.out.println("La Moy arithmetique vaut : "+mArth);
            System.out.println("La Moy geometrique vaut : "+mGeo);

        }
        catch (Exception e){
            System.err.println("Entrer invalid");
        }
        sc.close();

    }
}
