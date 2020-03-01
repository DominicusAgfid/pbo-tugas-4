
public class Segitiga {
    private double alas,tinggi;

    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double luas(){
        return 0.5*this.alas*this.tinggi;
    }
    public double keliling() {
        return this.alas + this.tinggi + (Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2)));
    }
}
