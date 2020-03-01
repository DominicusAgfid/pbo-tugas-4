public class Balok extends PersegiPanjang {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double volume(){
        return super.luas()*this.tinggi;
    }
}
