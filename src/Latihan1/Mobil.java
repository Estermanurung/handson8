package Latihan1;

public class Mobil extends Kendaraan {
    // Properties tambahan
    private int jumlahPintu;
    private String jenisBahanBakar;

    // Constructor
    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merk , warna, tahunProduksi);
        System.out.println("Constructor Mobil dipanggil");
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
        // TODO: Panggil constructor parent dengan super()
        // TODO: Inisialisasi properties tambahan
        // TODO: Print "Constructor Mobil dipanggil"
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlash Pintu: " + jumlah Pintu);
        System.out.println("Bahan Bakar:" + Bahan Bakar);

        // TODO: Panggil super.displayInfo() terlebih dahulu
        // TODO: Tambahkan informasi spesifik Mobil
    }

    // Method tambahan khusus Mobil
    public void nyalakanAC() {
        System.out.println("Nyalakan AC");
        // TODO: Print "AC menyala"
    }

    // Getter
    public int getJumlahPintu() {
        return jumlahPintu;
    }
}
