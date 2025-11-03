package Latihan2;

public class Pegawai {
    // Properties
    protected String nip;
    protected String nama;
    protected String jurusan;

    // Constructor
    public Pegawai(String nip, String nama, String jurusan) {
        System.out.println("Pegawai constructor called");
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        // TODO: Implementasi
    }

    // Method untuk di-override
    public void displayInfo() {
        System.out.println("===Info Pegawai===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan:" + jurusan);
        // TODO: Print info pegawai
    }

    // Method clone dengan return type Pegawai
    public Pegawai clone() {
        try {
        // TODO: Return new Pegawai dengan data yang sama
        return (Pegawai) super.clone();
    }catch (CloneNotSupportedException e) {
            throw  new AssertionError();
        }
        }

    // Protected method untuk ditest widening
    protected void methodProtected() {
        System.out.println("Protected method in pegawai");
        // TODO: Print "Protected method in Pegawai"
    }

    // Final method - tidak bisa di-override
    public final void calculateSalary() {
        System.out.println("Menghitung gaji pegawai");
        // TODO: Print "Menghitung gaji pegawai..."
    }

    @Override
    public String toString() {
        // TODO: Override toString()
        return "Pegawai{" +
                "nip ='" + nip + '\'' +
                ",nama =' " + nama + '\'' +
                ", jurusan='" + jurusan + '\'' + '}';
    }
}
