package javaapplication2.Enkapsulasi.Latihan;

public class Enkaps {
    public String namaSiswa;
    private int usia;
    protected String alamat;
    
    public void cetakBiodata(){
        System.out.println("Nama : " + namaSiswa);
        System.out.println("Alamat : " + alamat);
    }
    
    public void setUsia(int usia){
        this.usia = usia;
    }
    
    public int getUsia(){
        return usia;
    }
}
