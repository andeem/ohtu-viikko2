import java.util.Scanner;

import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kertolasku, kerrottava: ");
        String kerrottava = scanner.nextLine();
        System.out.println("Kertolasku, kertoja: ");
        String kertoja = scanner.nextLine();
        Multiplier mp = new Multiplier(Integer.parseInt(kerrottava));
        System.out.println("Hello " + mp.multiply(Integer.parseInt(kertoja)));
        
    }
}