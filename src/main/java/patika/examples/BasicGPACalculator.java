package patika.examples;

import java.util.Scanner;

public class BasicGPACalculator {
    public static void main(String[] args) {
        int mathGrade, physicsGrade, turkishGrade, historyGrade, chemistryGrade, musicGrade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notu");
        mathGrade = scanner.nextInt();

        System.out.println("Fizik Notu");
        physicsGrade = scanner.nextInt();

        System.out.println("Türkçe Notu");
        turkishGrade = scanner.nextInt();

        System.out.println("Tarih Notu");
        historyGrade = scanner.nextInt();

        System.out.println("Kimya Notu");
        chemistryGrade = scanner.nextInt();

        System.out.println("Müzik Notu");
        musicGrade = scanner.nextInt();

        System.out.println("Not Ortalaması : " + (mathGrade + physicsGrade + turkishGrade + historyGrade + chemistryGrade + musicGrade) / 6);

    }
}
