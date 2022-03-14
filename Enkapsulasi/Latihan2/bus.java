package javaapplication2.Enkapsulasi.Latihan2;

public class bus {
    private int penumpang, maxpenumpang;
    
    public bus(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void pluspenumpang(int penumpang){
        int temp;
        temp = this.penumpang = penumpang + penumpang;
        if (temp >= maxpenumpang){
            System.out.println("Overload penumpang");
        } else {
            this.penumpang = temp;
        }
    }
        
    public void cetak(){
        System.out.println("Penumpang saat ini : " + penumpang);
        System.out.println("Penumpang seharusnya : " + maxpenumpang);
    }
}
