package Latihan2;

public class Dosen extends Pegawai {
    // Properties tambahan
    private String mataKuliah;
    private int pengalamanMengajar;

    // Constructor
    public Dosen(String nip, String nama, String jurusan,
                 String mataKuliah, int pengalamanMengajar) {
        super(nip, nama, jurusan);
        System.out.println("Dosen constructor called");
        this.mataKuliah = mataKuliah;
        this.pengalamanMengajar = pengalamanMengajar;
        // TODO: Implementasi dengan super
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mata kuliah: " + mataKuliah);
        System.out.println("Pengalaman: " + pengalamanMengajar + "tahun");
        // TODO: Override dengan info dosen
    }

    // Override clone dengan covariant return type
    @Override
    public Dosen clone() {
        // TODO: Return new Dosen
        return new Dosen(this.nip, this.nama,this.jurusan,this.mataKuliah, this.pengalamanMengajar);
    }

    // Override dengan widening access
    @Override
    public void methodProtected() {
        System.out.println("Widening acces modifier: ALLOWED");
        // TODO: Override dari protected ke public
    }
}
