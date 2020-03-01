
public class Lingkaran {
    private double r;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double keliling() {
        return Math.PI*(this.r+this.r);
    }
    public double luas() {
        return Math.PI*this.r*this.r;
    }
}
