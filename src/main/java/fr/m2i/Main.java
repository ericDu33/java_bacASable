package fr.m2i;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nbchoice;
        int resultat;
        int fois=1;

        try {
            System.out.print("Ecrire table de 10 : ");
            nbchoice = scanner.nextInt();

            String resultToFormat = "%d * %d = %d";

            while (fois <= 10) {
                resultat = nbchoice * fois;
                String result = String.format(resultToFormat, fois, nbchoice, resultat);
                System.out.println(result);
                fois++;
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}