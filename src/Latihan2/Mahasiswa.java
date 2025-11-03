package Latihan2;

import java.lang.invoke.MethodHandle;
import java.util.Objects;

public class Mahasiswa {
    // Properties
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
        // TODO: Implementasi
    }

    // Override toString
    @Override
    public String toString() {
        // TODO: Return string representation
        return " Mahasiswa{" +
                " nim = ' " + nim + '\'' +
                ", nama=' " + nama + '\'' +
                ", jurusan= '" + jurusan + '\'' +
                ", ipk=" + ipk +
                '}';
    }

    // Override equals - compare by NIM
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Mahasiswa)) return false;
        Mahasiswa other = (Mahasiswa) obj;
        // TODO: Implementasi equals berdasarkan NIM
        return Objects.equals(this.nim, other.nim);
    }

    // Override hashCode (best practice dengan equals)
    @Override
    public int hashCode() {
        // TODO: Return hash dari NIM
        return Objects.hash(nim);
    }
}
