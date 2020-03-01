

public class Persegi {
    private double sisi;

    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double luas(){
        return this.sisi*this.sisi;
    }
    public double keliling(){
        return this.sisi*4;
    }
}
