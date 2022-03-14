package javaapplication2.Enkapsulasi.Latihan2;

public class UjiBus {
    public static void main(String[] args) {
    bus busMini = new bus(10);
    busMini.cetak();

    busMini.pluspenumpang(3);
    busMini.cetak();

    busMini.pluspenumpang(1);
    busMini.cetak();

    busMini.pluspenumpang(1);
    busMini.cetak();
    }
}
