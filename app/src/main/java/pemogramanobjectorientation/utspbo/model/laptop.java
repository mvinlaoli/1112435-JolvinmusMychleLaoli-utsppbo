package pemogramanobjectorientation.utspbo.model;

import java.util.Scanner;

import pemogramanobjectorientation.utspbo.controller.elektronik;
import pemogramanobjectorientation.utspbo.enums.jeniselektronik;

public class laptop extends elektronik implements Powerable,RAMReplaceable, StorageReplaceable, Updatable {
    private String brand;
    private String model;
    private String os;
    private int ramSize;
    private int strogeSize;

    public laptop(String brand, String model, String os, int ramSize, int strogeSize) {
        super(jeniselektronik.LAPTOP);
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ramSize = ramSize;
        this.strogeSize = strogeSize;
    }

    public void replaceRam(int ramSize) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan ram anda : ");
        ramSize = sc.nextInt();
    }

    public void replaceStorage(int strogeSize) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan strorage anda : ");
        strogeSize = sc.nextInt();
    }

    
    @Override
    public String getPrintDetail() {
        String detail = "Tipe elektornik : " + getPrintDetail() + brand + model + os + ramSize + strogeSize ;
        return detail;
    }

    @Override
    public void turnOn() {
        System.out.println("ON");

    }

    @Override
    public void turnOff() {
        System.out.println("OFF");

    }

    @Override
    public void turnupdate() {
        System.out.println("UPDATE");

    }

}
