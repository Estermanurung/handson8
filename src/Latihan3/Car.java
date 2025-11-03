package Latihan3;

public class Car extends Vehicle {
    // Properties tambahan
    private int jumlahPenumpang;
    private String tipeTransmisi; // "Manual", "Automatic"
    private boolean acTersedia;

    // Constructor
    public Car(String merk, String model, int tahunProduksi, String nomorPolisi,
               double hargaRentalPerHari, int jumlahPenumpang,
               String tipeTransmisi, boolean acTersedia) {

        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jumlahPenumpang = jumlahPenumpang;
        this.tipeTransmisi = tipeTransmisi;
        this.acTersedia = acTersedia;
        // TODO: Implementasi dengan super
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Penumpang : " + jumlahPenumpang);
        System.out.println("Tipe Transmisi   :" + tipeTransmisi );
        System.out.println("AC Tersedia :" + (acTersedia? "Ya" : "Tidak" ));
        //TODO: Call super dan tambah info Car
    }
    // Getter & Setter boolean untuk AC
    public boolean isAcTersedia() {
        return acTersedia;
    }

    public void setAcTersedia(boolean acTersedia) {
        this.acTersedia = acTersedia;
    }

    // Override biaya rental (Car bisa punya surcharge)
    @Override
    public double getHargaRentalPerHari() {
        double total = super.getHargaRentalPerHari();

        if(acTersedia) {
            total += 0.10 * total;
        }
        // TODO: Implementasi dengan possible surcharge untuk AC
        return total;
    }
}

