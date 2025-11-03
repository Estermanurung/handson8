package Latihan1;

public class MobilSport extends Mobil {
    // Properties tambahan
    private boolean turbo;
    private int kecepatanMaksimal;

    // Constructor
    public MobilSport(String merk, String warna, int tahunProduksi,
                      int jumlahPintu, String jenisBahanBakar,
                      boolean turbo, int kecepatanMaksimal) {
        super(merk, warna, tahunProduksi, jumlahPintu, jenisBahanBakar);
        System.out.println("Constructor MobilSport dipanggil");
        this.turbo = turbo;
        this.kecepatanMaksimal = kecepatanMaksimal;
        // TODO: Implementasi constructor
    }



    // Override method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Turbo: " + (turbo ? "Ya" : "Tidak"));
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal);
        // TODO: Override dan tambahkan info MobilSport
    }

    // Method khusus MobilSport
    public void aktifkanTurbo() {
        // TODO: Print "TURBO DIAKTIFKAN! [merk] melaju dengan kecepatan maksimal!"
    }
}
