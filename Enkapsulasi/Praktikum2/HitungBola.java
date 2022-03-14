package javaapplication2.Enkapsulasi.Praktikum2;

import java.util.Scanner;

public class HitungBola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari : ");
        double jarijari = scan.nextDouble();
        Bola hitung = new Bola();
        hitung.setjarijari(jarijari);
        hitung.showDiameter();
        hitung.showLuasPermukaan();
        hitung.showVolume();
    }
}
