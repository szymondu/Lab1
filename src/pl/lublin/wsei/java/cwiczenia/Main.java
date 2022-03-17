package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dec = 0;
        do {
            System.out.print("Podaj liczbe do zamiany: ");
            dec = input.nextInt();
            String hex = Integer.toHexString(dec);
            String bin = Integer.toBinaryString(dec);
            if (dec == 0) break;
            System.out.printf("System 10: %d \n System 2: %s \n System 16: %s \n", dec, bin, hex);
        } while (true);
    }
}
