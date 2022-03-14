package javaapplication2.Enkapsulasi.Praktikum1;

import java.util.Scanner;

public class UjiBus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bus BusKecil = new Bus();
        System.out.println("Berapa penumpang yang naik?");
        BusKecil.addpenumpang(scan.nextInt());
        System.out.println("Berat badan penumpang : ");
        for (int a = 0; a < BusKecil.getPenumpang(); a++) {
            double temp = scan.nextDouble();
            BusKecil.setPenumpang(temp);
        }
        BusKecil.getPassword(90);
        BusKecil.getAverage();
        BusKecil.cetak();
    }
}
