import java.util.Scanner;

public class EX09TP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier N");
        try {
            int n = sc.nextInt();
            int sum =0;
            for (int i=1;i<n+1;i++){
                sum+=i;
            }
            System.out.println("La somme vaut : "+sum);
        }
        catch (Exception e){
            System.err.println("Entrer invalid");
        }
        sc.close();

    }
}
