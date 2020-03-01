
public class PersegiPanjang {
    private double panjang,lebar;
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double luas() {
        return this.panjang*this.lebar;
    }
    public double keliling() {
        return this.panjang*2 + this.lebar*2;
    }
}
