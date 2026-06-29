package pemogramanobjectorientation.utspbo.model;

import java.util.Scanner;

import pemogramanobjectorientation.utspbo.controller.elektronik;
import pemogramanobjectorientation.utspbo.enums.jeniselektronik;

public class komputer extends elektronik implements Powerable, Updatable,RAMReplaceable, StorageReplaceable , GPUReplacable, CPUReplacable {
    private String brand;
    private String model;
    private String os;
    private String gpu;
    private String cpu;
    private int ramSize;
    private int strogeSize;

    public komputer(String brand, String model, String os, String gpu, String cpu, int ramSize, int strogeSize) {
        super(jeniselektronik.KOMPUTER);
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ramSize = ramSize;
        this.strogeSize = strogeSize;
        this.gpu = gpu;
        this.cpu = cpu;
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

    public void replaceGPU(String gpu) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan gpu anda : ");
        gpu = sc.next();
    }

    public void replaceCPU(String cpu) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan cpu anda : ");
        cpu = sc.next();
    }


    @Override
    public String getPrintDetail() {
        String detail = "Tipe elektornik : " + getPrintDetail() + brand + model + os + ramSize + strogeSize + gpu + cpu;
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
