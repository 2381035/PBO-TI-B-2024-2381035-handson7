package pewarisan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;
    private int jenisBahanBakar;

    public Mobil(String merek, final String model, final int tahunProduksi, final int jumlahPintu, final String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void infoMobil(){
        infoKendaran();
        System.out.println("Jumlah pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}