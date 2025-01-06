import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    boolean pokracuj = true;
    while (pokracuj == true) {

        System.out.println("Vyberte možnost:");
        System.out.println("1: Spojení dvou řetězců");
        System.out.println("2: Zjištění délky řetězce");
        System.out.println("3: Převod řetězce na velká/malá písmena");
        System.out.println("4: Generování náhodného čísla v zadaném rozsahu");
        System.out.println("5: Výpočet druhé mocniny čísla");
        System.out.println("6: Ukonční programu");

        int cislo = sc.nextInt();


        switch (cislo) {
            case 1:
                System.out.println("Zadej 1. řetězec:");
                String veta1 = sc.next();
                System.out.println("Zadej 2. řetězec:");
                String veta2 = sc.next();
                System.out.println(veta1 + veta2);

                break;
            case 2:
                System.out.println("Napiš řetězec:");
                String veta3 = sc.next();
                System.out.println("Tento řetězec má: " + veta3.length() + " znaků.");

                break;
            case 3:
                System.out.println("Napiš řetězec:");
                String veta4 = sc.next();
                System.out.println("Chceš převést na: Velká/Malá");
                String veta5 = sc.next();
                if (veta5.equals("Velká")) {
                    System.out.println(veta4.toUpperCase());
                } else {
                    System.out.println(veta4.toLowerCase());
                }

                break;
            case 4:
                System.out.println("Zadej spodní hranici intervalu:");
                int cislo1 = sc.nextInt();
                System.out.println("Zadej horní hranici intervalu:");
                int cislo2 = sc.nextInt();
                Random rnd = new Random();
                System.out.println(rnd.nextInt(cislo1, cislo2));

                break;
            case 5:
                System.out.println("Zadej číslo:");
                int cislo3 = sc.nextInt();
                System.out.println("Jeho druhá mocnina je: " + Math.pow(cislo3, 2));

                break;
            case 6:
                pokracuj = false;

                break;
            default:

                break;

        }
    }
    }
}