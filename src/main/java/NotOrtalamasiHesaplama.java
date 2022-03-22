package main.java;

import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int matematik;
        int sosyalBilgiler;
        int fenBilgisi;
        int ingilizce;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        matematik = input.nextInt();

        System.out.println("Sosyal Bilgiler Notunuz : ");
        sosyalBilgiler = input.nextInt();

        System.out.println("Fen Bilgisi Notunuz :");
        fenBilgisi = input.nextInt();

        System.out.println("İngilizce Notunuz : ");
        ingilizce = input.nextInt();

        double toplam = (matematik + sosyalBilgiler + fenBilgisi + ingilizce);
        double sonuc = toplam / 4;

        System.out.println("Ortalamanız :" + sonuc);

        String ort = sonuc >= 60 ? "Geçti" : "Kaldı";
        System.out.println(ort);
    }
}

