package polymorfisme;

public class SegitigaSamaSisi extends BangunDatar{
    private double sisi;
    private double tinggi;

    public SegitigaSamaSisi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * sisi * tinggi;
    }

    @Override
    public double Keliling() {
        return 3 * sisi;
    }
}