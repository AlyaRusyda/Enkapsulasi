package javaapplication2.Enkapsulasi.Latihan1;

public class UjiBus {
    public static void main(String[] args) {
        bus busMini = new bus();
        busMini.penumpang = 5;
        busMini.maxpenumpang = 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
