package rentalmobil_okky;

import java.util.Scanner;

class Mobil {
    String nama;
    double hargaSewaPerHari;
    boolean tersedia;

    public Mobil(String nama, double hargaSewaPerHari, boolean tersedia) {
        this.nama = nama;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = tersedia;
    }

    public void tampilkanInfoMobil() {
        System.out.println("Nama Mobil: " + nama);
        System.out.println("Harga Sewa Per Hari: Rp" + hargaSewaPerHari);
        System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
        System.out.println("--------------------------");
    }
}

public class RentalMobil_Okky {

    public static void main(String[] args) {
        // Input identitas pengguna
        System.out.println("Mohon masukkan data diri anda");
        try (Scanner scanner = new Scanner(System.in)) {
            // Input identitas pengguna
            System.out.print("Masukkan Nama: ");
            String namaPelanggan = scanner.nextLine();
            
            System.out.print("Masukkan Umur: ");
            int umurPelanggan = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            
            System.out.print("Masukkan Alamat: ");
            String alamatPelanggan = scanner.nextLine();
            
            // Daftar mobil
            Mobil[] daftarMobil = {
                new Mobil("Toyota Avanza", 350000, true),
                new Mobil("Honda Brio", 250000, true),
                new Mobil("Suzuki Ertiga", 300000, true)
            };
            
            // Menampilkan daftar mobil
            System.out.println("\nDaftar Mobil yang Tersedia:");
            for (int i = 0; i < daftarMobil.length; i++) {
                System.out.println((i + 1) + ". " + daftarMobil[i].nama);
            }
            
            // Memilih mobil yang akan disewa
            System.out.print("Pilih mobil yang ingin disewa (1-3): ");
            int pilihan = scanner.nextInt();
            
            // Validasi pilihan mobil
            if (pilihan >= 1 && pilihan <= daftarMobil.length) {
                Mobil mobilDipilih = daftarMobil[pilihan - 1];
                if (mobilDipilih.tersedia) {
                    System.out.print("Berapa hari Anda ingin merental mobil ini? ");
                    int jumlahHari = scanner.nextInt();
                   
                     // Menampilkan identitas pengguna di akhir
                    System.out.println("--------------------------");
                    System.out.println("\nIdentitas Pelanggan:");
                    System.out.println("Nama: " + namaPelanggan);
                    System.out.println("Umur: " + umurPelanggan);
                    System.out.println("Alamat: " + alamatPelanggan);
                    
                    // Menampilkan informasi sewa
                    double totalBiaya = mobilDipilih.hargaSewaPerHari * jumlahHari;
                    System.out.println("menyewa: " + mobilDipilih.nama);
                    System.out.println("Durasi Sewa: " + jumlahHari + " hari");
                    System.out.println("Total Biaya: Rp" + totalBiaya);
                    System.out.println("--------------------------");
                    
                    mobilDipilih.tersedia = false;
                           
                } else {
                    System.out.println("Maaf, mobil ini tidak tersedia.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
