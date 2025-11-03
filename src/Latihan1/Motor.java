package Latihan1;

public class Motor extends Kendaraan {
    // Properties tambahan
    private String jenisMotor; // "sport", "matic", "bebek"
    private boolean hadRemCakram;

    // Constructor
    public Motor(String merk, String warna, int tahunProduksi, String jenisMotor) {
        super(merk, warna, tahunProduksi);
        System.out.println("Constuctor Motor dipanggil");
        this.jenisMotor = jenisMotor;
        this.hadRemCakram = jenisMotor.equalsIgnoreCase("Sport");
        // TODO: Implementasi constructor dengan super
    }

    // Override method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Motor:" + jenisMotor);
        System.out.println("Memiliki Ram Cakram:" + (hadRemCakram ?  "Ya" : "Tidak"));
        // TODO: Implementasi dengan memanggil super dan menambahkan info Motor
    }

    @Override
    public void klakson() {
        System.out.println("Tiiin tiiin (suara notor)");
        // TODO: Print "Tiiin tiiin! (suara motor)"
    }

    // Method khusus Motor
    public void lakukanWheely() {
        System.out.println(merk + " melakukan wheelie!");
        // TODO: Print "[merk] melakukan wheelie!"
    }
}
