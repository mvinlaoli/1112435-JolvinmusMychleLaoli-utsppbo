package pemogramanobjectorientation.kuis1pbo.views;

import pemogramanobjectorientation.kuis1pbo.enums.JenisKendaraan;
import pemogramanobjectorientation.kuis1pbo.model.Helikopter;
import pemogramanobjectorientation.kuis1pbo.model.Kapal;
import pemogramanobjectorientation.kuis1pbo.model.Kendaraan;
import pemogramanobjectorientation.kuis1pbo.model.Mobil;
import pemogramanobjectorientation.kuis1pbo.model.Motor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KuisPboApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Kendaraan> kendaraan = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Semua Kendaraan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahKendaraan();
                    break;
                case 2:
                    tampilkanSemuaKendaraan();
                    break;
                case 3:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 3);
    }

    private static void tambahKendaraan() {
        if (kendaraan.isEmpty()) {
                System.out.println("Tidak ada kendaraan yang terdaftar.");
            } else {
                for (Kendaraan k : kendaraan) {
                    System.out.println(k.getPrintDetail());
                }
            }
           
            
        
        switch (tipe) {
            case 1:
                System.out.print("Masukkan nomor polisi: ");
                String nomorPolisiMotor = sc.nextLine();
                System.out.print("Masukkan model: ");
                String modelMotor = sc.nextLine();
                kendaraan.add(new Motor(nomorPolisiMotor, modelMotor));
                break;
            case 2:
                System.out.print("Masukkan nomor polisi: ");
                String nomorPolisiMobil = sc.nextLine();
                System.out.print("Masukkan model: ");
                String modelMobil = sc.nextLine();
                System.out.print("Masukkan jenis bahan bakar: ");
                String jenisBahanBakar = sc.nextLine();
                System.out.print("Masukkan kapasitas: ");
                int kapasitasMobil = sc.nextInt();
                sc.nextLine(); 
                kendaraan.add(new Mobil(nomorPolisiMobil, modelMobil, jenisBahanBakar, kapasitasMobil));
                break;
            case 3:

                int kapasitasHelikopter = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Masukkan penggunaan: ");
                String penggunaanHelikopter = sc.nextLine();
                kendaraan.add(new Helikopter(kapasitasHelikopter, penggunaanHelikopter));
                break;
            case 4:
                System.out.print("Masukkan lebar: ");
                int lebarKapal = sc.nextInt();
                System.out.print("Masukkan panjang: ");
                int panjangKapal = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Masukkan jenis: ");
                String jenisKapal = sc.nextLine();
                System.out.print("Masukkan kapasitas: ");
                int kapasitasKapal = sc.nextInt();
                sc.nextLine(); 
                kendaraan.add(new Kapal(lebarKapal, panjangKapal, jenisKapal, kapasitasKapal));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        while();
       
    }

    private static void tampilkanSemuaKendaraan() {
        System.out.println("Jenis Kendaraan:");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Helikopter");
        System.out.println("4. Kapal");
        System.out.print("Masukkan pilihan: ");
        int jenisKendaraan = sc.nextInt();
        sc.nextLine();

    }


}
