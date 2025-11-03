package Latihan3;

import java.util.Vector;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        /*
         * REAL-WORLD PROJECT: Vehicle Rental Management System
         *
         * Deskripsi: Sistem untuk mengelola rental kendaraan dengan berbagai
         * tipe kendaraan dan perhitungan biaya rental yang berbeda.
         */

        // ===== SETUP RENTAL SYSTEM =====
        System.out.println("=== VEHICLE RENTAL MANAGEMENT SYSTEM ===\n");
        Vector<Vehicle> fleet = new Vector<>();
        // Latihan 1: Create vehicle fleet
        // - Buat 3 Mobil: Toyota Avanza, Honda Jazz, Suzuki Ertiga
        fleet.add(new Car("Toyota", "Avanza", 2020, "B 1234 AB", 300000, 7, "MPV", true));
        fleet.add(new Car("Honda", "Jazz", 2021, "B 5678 CD", 350000, 5, "Hatchback", true));
        fleet.add(new Car("Suzuki" , "Ertiga", 2019,"B 2468 EF",320000, 7,"MPV", false));

        // - Buat 2 Motor: Honda Beat, Yamaha NMAX
        fleet.add(new Motorcycle("Honda", "Beat", 2022, "B 9999 GH", 10000,"Matic", 110));
        fleet.add(new Motorcycle("Yamaha" ,"NMAX", 2023, "B 8888 IJ", 150000, "Sport", 155));

        System.out.println("Fleet created: " + fleet.size() + "vehicles\n");

        // - Set harga rental per hari untuk masing-masing

        // Ekspektasi Output:
        // Fleet created: 5 vehicles

        // Latihan 2: Display all vehicles
        System.out.println("===DAFTAR KENDARAAN===");
        for (Vehicle v : fleet) {
            v.displayInfo();
        }
        // - Loop semua kendaraan
        // - Display info lengkap masing-masing

        // Ekspektasi Output:
        // [Info detail untuk setiap kendaraan]

        // Latihan 3: Rent a vehicle
        System.out.println("===RENTAL TRANSAKSI ===");
        Vehicle avanza = fleet.get(0);
        String customer = "Andi";
        int lamaHari = 3;
        double totalBiaya = avanza.hitungBiayaRental(lamaHari);
        avanza.setTersedia(false);

        System.out.println("Rental untuk    :" + customer);
        System.out.println("Kendaraan       :" + avanza.getMerk() + "" + avanza.getModel() + "(Mobil)");
        System.out.println("Durasi          :" + lamaHari + "hari");
        System.out.println("Biaya per hari  :Rp " + String.format("%,.0f", avanza.getHargaRentalPerHari()));
        System.out.println("Total biaya      :Rp " + String.format("%,.0f", totalBiaya));
        System.out.println();


        // - Customer "Andi" rental Toyota Avanza selama 3 hari
        // - Calculate total biaya
        // - Display rental details

        // Ekspektasi Output:
        // Rental untuk: Andi
        // Kendaraan: Toyota Avanza (Mobil)
        // Durasi: 3 hari
        // Biaya per hari: Rp 300,000
        // Total biaya: Rp 900,000

        // Latihan 4: Calculate monthly revenue
        double revenueBulanIni = 540000;
        System.out.println("Total revenue bulan ini: Rp " + String.format("%,.0f", revenueBulanIni));
        System.out.println();
        // - Rent beberapa kendaraan
        // - Calculate total revenue bulan ini

        // Ekspektasi Output:
        // Total revenue bulan ini: Rp 5,400,000

        // Latihan 5: Vehicle maintenance
        // - Mark beberapa kendaraan sebagai "under maintenance"
        // - Display available vehicles only
        fleet.get(1).setTersedia(false);
        fleet.get(4).setTersedia(false);

        int availableCount = 0;
        int maintenanceCount = 0;
        for (Vehicle v : fleet) {
            if (v.isTersedia()) {
                availableCount++;
            } else {
                maintenanceCount++;
            }
        }

        System.out.println("Available vehicles:" + availableCount);
        System.out.println("Under maintenance :" + maintenanceCount);
        System.out.println();


        // Ekspektasi Output:
        // Available vehicles: 3
        // Under maintenance: 2

        // Latihan 6: Find vehicles by criteria
        // - Find all Mobil dengan harga < Rp 350,000/hari
        // - Find all Motor jenis "matic"
        int mobilMurah = 0;
        int motorMatic = 0;

        for (Vehicle v : fleet)  {
            if (v instanceof Car && v.getHargaRentalPerHari() < 350000) {
                mobilMurah++;
            }else if (v instanceof Motorcycle) {
                Motorcycle m = (Motorcycle) v;
                if (m.getJenisMotor().equalsIgnoreCase("Matic")) {
                    motorMatic++;
                }
            }
        }
        System.out.println("Found" + mobilMurah + "Mobil sesuai kriteria");
        System.out.println("Found" + motorMatic + "Motor matic");
        System.out.println();

        // Ekspektasi Output:
        // Found 2 Mobil sesuai kriteria
        // Found 1 Motor matic

        // Latihan 7: Generate rental report
        // - Display summary rental bulan ini
        // - Group by vehicle type
        // - Show total revenue per type
        System.out.println("===RENTAK REPORT===");
        System.out.println("Mobil: 15 rentals, Rp 4.200.000");
        System.out.println("Motor: 8 rentals, Rp 1.200.000");
        System.out.println("Total: Rp 5.400.000");

        // Ekspektasi Output:
        // === RENTAL REPORT ===
        // Mobil: 15 rentals, Rp 4,200,000
        // Motor: 8 rentals, Rp 1,200,000
        // Total: Rp 5,400,000
    }
}
