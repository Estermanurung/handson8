package Latihan1;

public class Truk extends Kendaraan {
    // Properties tambahan
    private double kapasitasMuatan; // dalam ton
    private int jumlahRoda;

    // Constructor
    public Truk(String merk, String warna, int tahunProduksi, double kapasitasMuatan, int jumlahRoda) {
        super(merk, warna, tahunProduksi);
        System.out.println("Constructor Truk dipanggil");
        this.kapasitasMuatan = kapasitasMuatan;
        this.jumlahRoda = jumlahRoda;
        // TODO: Implementasi constructor
    }

    // Override method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Muatan:" + kapasitasMuatan + " ton ");
        System.out.println("Jumlah Roda: " + jumlahRoda);
        // TODO: Override dan tambahkan info Truk
    }

    @Override
    public void klakson() {
        super.klakson();
        System.out.println("HONK HONK! (suara klakson truk yang lebih keras)");


        // TODO: Panggil super.klakson() dulu
        // TODO: Kemudian print "HONK HONK! (suara klakson truk yang lebih keras)"
    }
}

