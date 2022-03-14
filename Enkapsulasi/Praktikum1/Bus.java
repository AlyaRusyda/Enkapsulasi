package javaapplication2.Enkapsulasi.Praktikum1;

public class Bus {
    private double Penumpang, Counter;
    
    public void addpenumpang(int Penumpang){
        this.Penumpang += Penumpang;
    }
    public double getPenumpang(){
        return Penumpang;
    }
    public void setPenumpang(double Penumpang){
        this.Counter += Penumpang;
    }
    public void getPassword(int password){
        if (password == 90){
            System.out.println("password benar");
        } else{
            System.out.println("pass salah");
        }
    }
    public double getAverage(){
        return this.Counter / this.Penumpang;
    }
    public void cetak(){
        System.out.println("Rata-rata berat badan penumpang : " + getAverage());
    }
}
