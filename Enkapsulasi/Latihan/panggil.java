package javaapplication2.Enkapsulasi.Latihan;

public class panggil {
    public static void main(String[] args) {
        Enkaps pe = new Enkaps();
        pe.namaSiswa = "Alya";
        pe.alamat = "Solo";
        pe.cetakBiodata();
        pe.setUsia(14);
        System.out.println("Usia : " + pe.getUsia());
    }
}
