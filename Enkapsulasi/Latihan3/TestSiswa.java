package javaapplication2.Enkapsulasi.Latihan3;

public class TestSiswa {
    public static void main(String[] args) {
    encapSiswa siswa = new encapSiswa();
    siswa.setName("Agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("Nama: " + siswa.getName());
        System.out.println("Alamat : " + siswa.getAddress());
        System.out.println("Umur : " + siswa.getAge());
    
    }
}
