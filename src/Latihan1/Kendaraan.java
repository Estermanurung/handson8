package Latihan1;

public class Kendaraan {
    // Properties
    protected String merk;
    protected String warna;
    protected int tahunProduksi;
    private String nomorRangka;

    // Constructor
    public Kendaraan(String merk, String warna, int tahunProduksi) {
        System.out.println("Constructor kendaraan dipanggil");
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.nomorRangka = merk.substring(0,3).toUpperCase() + tahunProduksi + "001";
        // TODO: Implementasi constructor
        // - Inisialisasi semua properties
        // - Print pesan "Constructor Kendaraan dipanggil"
    }

    // Method untuk menampilkan info
    public void displayInfo() {
        System.out.println("=== Info Kendaraan ===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna:" + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        // TODO: Print semua informasi kendaraan
    }

    // Method klakson
    public void klakson() {
        System.out.println("Tin tin!");
        // TODO: Print "Tin tin!"
    }

    // Method untuk menghitung umur kendaraan
    public int hitungUmur() {
        int tahunSekarang = java.time.Year.now().getValue();
        // TODO: Return umur kendaraan (tahun sekarang - tahun produksi)
        return tahunSekarang - this.tahunProduksi ;
    }

    // Getter dan Setter
    public String getNomorRangka() {
        return nomorRangka;
    }

    public void setNomorRangka(String nomorRangka) {
        this.nomorRangka = nomorRangka;
    }
}

