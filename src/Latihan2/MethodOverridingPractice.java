package Latihan2;

public class MethodOverridingPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Method Overriding
         *
         * Instruksi: Lengkapi semua latihan untuk menguasai method overriding,
         * covariant return types, dan best practices.
         */

        // ===== BASIC METHOD OVERRIDING =====
        System.out.println("=== BASIC METHOD OVERRIDING ===");

        // Latihan 1: Override method toString()
        // - Buat object Mahasiswa dengan parameter:
        //   nim: "2024001", nama: "Budi", jurusan: "Informatika", ipk: 3.75
        // - Print object menggunakan toString()
        Mahasiswa m1 = new Mahasiswa("2481019","Ester" , "Informatika" , 3.62);
        System.out.println(m1);

        // Ekspektasi Output:
        // Mahasiswa{nim='2024001', nama='Budi', jurusan='Informatika', ipk=3.75}

        // Latihan 2: Override method equals()
        // - Buat dua object Mahasiswa dengan NIM yang sama
        // - Compare menggunakan equals()
        // - Compare menggunakan == (reference equality)
        Mahasiswa m2 = new Mahasiswa("2024001", "Budi", "Informatika", 3.75);
        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println("m1 == m2: " + (m1 == m2));

        // Ekspektasi Output:
        // m1.equals(m2): true (karena NIM sama)
        // m1 == m2: false (referensi berbeda)

        // ===== OVERRIDING WITH SUPER =====
        System.out.println("\n=== OVERRIDING WITH SUPER ===");

        // Latihan 3: Override dengan memanggil super
        // - Buat object Dosen dengan parameter:
        //   nip: "198901001", nama: "Dr. Sarah", jurusan: "Informatika",
        //   mataKuliah: "PBO", pengalamanMengajar: 10
        // - Panggil method displayInfo()
        Dosen d1 = new Dosen("198901001" , "Dr.Sarah" , "Informatika", "PBO", 10);
        d1.displayInfo();

        // Ekspektasi Output:
        // === Info Pegawai ===
        // NIP: 198901001
        // Nama: Dr. Sarah
        // Jurusan: Informatika
        // Mata Kuliah: PBO
        // Pengalaman: 10 tahun

        // Latihan 4: Chain of overriding
        // - Buat object DosenProfessor extends Dosen
        // - Override displayInfo() untuk menambah info gelar profesor
        // - Test chain dari Pegawai -> Dosen -> DosenProfessor
        DosenProfessor dp = new DosenProfessor("197879877", "Prof.Timbul", "Informatika",
                "PBO" , 20, "Profesor" , 15);
        dp.displayInfo();

        // Ekspektasi Output:
        // Pegawai constructor called
        // Dosen constructor called
        // DosenProfessor constructor called
        // [info lengkap dengan gelar profesor]

        // ===== COVARIANT RETURN TYPES =====
        System.out.println("\n=== COVARIANT RETURN TYPES ===");

        // Latihan 5: Return type yang lebih spesifik
        // - Override method clone() untuk return type yang lebih spesifik
        // - Parent return type: Pegawai
        // - Child return type: Dosen (covariant)
        Dosen d2 = new Dosen("199287634", "Dr.Lina", "Informatika", "Basis Data", 12);
        Dosen cloneDosen = d2.clone();
        System.out.println("Clone berhasil dengan type yang lebih spesifik");
        System.out.println("Original != clone:" + (d2 != cloneDosen));
        System.out.println("Original.equals(clone): " + d2.equals(cloneDosen));

        // Ekspektasi Output:
        // Clone berhasil dengan type yang lebih spesifik
        // original != clone (referensi berbeda)
        // original.equals(clone) (konten sama)

        // ===== OVERRIDING RULES =====
        System.out.println("\n=== OVERRIDING RULES ===");

        // Latihan 6: Access modifier rules
        // - Override method dengan access yang sama atau lebih luas
        // - Test: protected -> public (VALID)
        // - Test: public -> protected (INVALID - compile error)
        System.out.println();

        // Ekspektasi Output:
        // Widening access modifier: ALLOWED
        // Narrowing access modifier: COMPILE ERROR
        System.out.println("Widening access modifier: ALLOWED");
        System.out.println("Narrowing access modifier: COMPILE ERROR");

        // Latihan 7: Return type rules
        // - Override dengan same return type
        // - Override dengan covariant return type
        // - Override dengan unrelated return type (ERROR)
        System.out.println("\n=== RETURN TYPE RULES ===");
        System.out.println("Same return type: VALID");
        System.out.println("Covariant return typr: VALID");
        System.out.println("Unrelated return type: COMPILE ERROR");

        // Ekspektasi Output:
        // Same return type: VALID
        // Covariant return type: VALID
        // Unrelated return type: COMPILE ERROR

        // Latihan 8: Final method
        // - Try to override final method -> COMPILE ERROR
        // - Final method tidak bisa di-override
        System.out.println("\n=== FINAL METHOD ===");
        System.out.println("Cannot override final method: COMPILE ERROR");

        // Ekspektasi Output:
        // Cannot override final method: COMPILE ERROR
    }
}

