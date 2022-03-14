package javaapplication2.Enkapsulasi.Praktikum2;

public class Bola {
    private double jarijari;
    
    public void setjarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public void showDiameter() {
        System.out.println("Diameter bola adalah " + 2 * jarijari);
    }
    
    public void showLuasPermukaan() {
        System.out.println("Luas permukaan bola adalah " + (4 * Math.PI * Math.pow(jarijari, 2)));
    }
    
    public void showVolume(){
        System.out.println("Volume bola adalah " + (4/3 * Math.PI * Math.pow(jarijari, 3)));
    }
}
