import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EXO13TP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un numéro compris entre 1 et 12");


        int month=-1;
while (month< 0 && month>12){

    try {
        month = sc.nextInt();
        System.out.println(LocalDateTime.of(2022,month,02,22,34).getMonth());
        break;

    }
    catch (DateTimeException e){
        System.out.println("Mois inexistant !");
    }
    catch (Exception e){
        System.err.println("Entrer invalid");
    }

}
        sc.close();
}
}
