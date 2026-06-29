package pemogramanobjectorientation.utspbo.view;
import pemogramanobjectorientation.kuis1pbo.model.Kendaraan;
import pemogramanobjectorientation.utspbo.*;
import pemogramanobjectorientation.utspbo.controller.elektronik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<elektronik> elektornik = new ArrayList<>();
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Tambah Device");
            System.out.println("2. Tampilkan Tambah Device");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahDevice();
                    break;
                case 2:
                  
                    break;
                case 3:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 3);
    }

     private static void tambahDevice() {
        if (elektornik.isEmpty()) {
                System.out.println("Tidak ada kendaraan yang terdaftar.");
            } else {
                for (Kendaraan k : elektornik) {
                    System.out.println(k.getPrintDetail());
                }
            }

        }

    
}
