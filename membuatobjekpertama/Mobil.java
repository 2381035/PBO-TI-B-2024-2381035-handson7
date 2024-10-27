package membuatobjekpertama;

public class Mobil {
    private String warna;
    private String merek;
    private int kecepatanMaks;

    public Mobil(String warna, String merek, int kecepatanMaks){
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo(){
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Maks: " + kecepatanMaks);
    }

    public void berjalan(){
        System.out.println("Mobil " + merek + "sedang berjalan");
    }

    public void berhenti(){
        System.out.println("Mobil " + merek + " sedang berhenti");
    }
}