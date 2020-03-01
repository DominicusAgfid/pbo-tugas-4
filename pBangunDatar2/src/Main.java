
public class Main {

    public static void main(String[] args) {
        Kubus b = new Kubus();
        Silinder s = new Silinder();
        Balok bl = new Balok();
        Segitiga s3 = new Segitiga();
        b.setSisi(5);
        System.out.println("Persegi");
        System.out.println("Luas = "+b.luas());
        System.out.println("Keliling = "+b.keliling());
        System.out.println("Kubus");
        System.out.println("Volume = "+b.volume());
        s.setR(7);
        s.setTinggi(10);
        System.out.println("lingkaran");
        System.out.println("Luas = "+s.luas());
        System.out.println("Keliling = "+s.keliling());
        System.out.println("Silinder");
        System.out.println("Volume = "+s.volume());
        bl.setLebar(5);
        bl.setPanjang(8);
        bl.setTinggi(6);
        System.out.println("Persegi Panjang");
        System.out.println("Luas = "+bl.luas());
        System.out.println("Keliling = "+bl.keliling());
        System.out.println("Balok");
        System.out.println("Volume = "+bl.volume());
        s3.setAlas(4);
        s3.setTinggi(3);
        System.out.println("Segitiga");
        System.out.println("Luas = "+s3.luas());
        System.out.println("Keliling = "+s3.keliling());
    }
}
