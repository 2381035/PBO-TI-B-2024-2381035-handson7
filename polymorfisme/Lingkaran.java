package polymorfisme;

public class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(final double jariJari){
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double Keliling() {
        return 2 * Math.PI * jariJari;
    }
}