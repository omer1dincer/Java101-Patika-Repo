package patika.examples;

import java.util.Scanner;

public class GreatestTaxCalculator {
    static final double taxRate = 0.18;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double price = 0.0;
        System.out.print("Ürün Fiyatı Girin : ");
        price = scanner.nextDouble();
        System.out.println("Ürün Fiyatınız : " + price + "\n Vergi Oranı : " + taxRate + "\n Vergi Miktarı : " + (price * taxRate) + "\nToplam miktar : " + (price + (price * taxRate)));

    }
}
