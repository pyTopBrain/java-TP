import java.util.Scanner;

public class Exo3TP1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int math, chem,bio;
        System.out.println("Enter the marks of Math");
        math = in.nextInt();

        System.out.println("Enter the marks of Chemistry");
        chem= in.nextInt();

        System.out.println("Enter the marks of biology");
        bio= in.nextInt();



        System.out.printf("The maximumGrade is "+ Math.max(math, Math.max(chem, bio)));
        System.out.printf("The minimumGrade is "+ Math.min(math, Math.min(chem, bio)));

        double average = (math + chem + bio)/3;
        System.out.println("The average of all marks is "+ average);
    }
}
