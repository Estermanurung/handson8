package Latihan3;

public class Motorcycle extends Vehicle {
    // Properties tambahan
    private String jenisMotor; // "Sport", "Matic", "Bebek"
    private int kapasitasMesin; // dalam CC

    // Constructor
    public Motorcycle(String merk, String model, int tahunProduksi,
                      String nomorPolisi, double hargaRentalPerHari,
                      String jenisMotor, int kapasitasMesin) {
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jenisMotor = jenisMotor;
        this.kapasitasMesin = kapasitasMesin;
        // TODO: Implementasi
    }
    // Getter & Setter
    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

        // Override displayInfo
    @Override
    public void displayInfo() {
        System.out.println("===Info Motor===");
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Nomor Polisi: " + nomorPolisi);
        System.out.println("Harga Rental/Hari:Rp " + String.format("%.0f" , hargaRentalPerHari));
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Sedang Dirental"));
        System.out.println();


        // TODO: Implementasi
    }

    // Override biaya rental (Motor lebih murah)
    @Override
    public double hitungBiayaRental(int jumlahHari) {
        double total = hargaRentalPerHari * jumlahHari;
        double diskon = total * 0.10;
        // TODO: Implementasi
        return total - diskon;
    }
}

