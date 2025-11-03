package Latihan2;

public class DosenProfessor extends Dosen {
    // Properties tambahan
    private String gelarProfesor;
    private int jumlahPenelitian;

    // Constructor
    public DosenProfessor(String nip, String nama, String jurusan,
                          String mataKuliah, int pengalamanMengajar,
                          String gelarProfesor, int jumlahPenelitian) {
        super(nip, nama, jurusan, mataKuliah,pengalamanMengajar);

        this.gelarProfesor = gelarProfesor;
        this.jumlahPenelitian = jumlahPenelitian;
        // TODO: Implementasi
    }

    // Override displayInfo (chain dari Dosen)
    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Gelar Profesor: " + gelarProfesor);
        System.out.println("Jumlah Penelitian:" + jumlahPenelitian);
        // TODO: Call super dan tambah info profesor
    }
}
