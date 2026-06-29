package pemogramanobjectorientation.utspbo.model;
import java.util.Scanner;

import pemogramanobjectorientation.utspbo.controller.elektronik;
import pemogramanobjectorientation.utspbo.enums.jeniselektronik;

public class handphone extends elektronik implements Powerable ,Updatable,Callable{
    private String brand;
    private String model;
    private String os;
    private int ramSize = 4;
    private int strogeSize = 250;
    public handphone(String brand, String model, String os, int ramSize, int strogeSize){
        super(jeniselektronik.HANDPHONE);
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ramSize = ramSize;
        this.strogeSize = strogeSize;
    }

    public void makeCall(){
       System.out.println("YES");
    };
    

    @Override
    public String getPrintDetail() {
        String detail = "Tipe elektornik : " + getPrintDetail() + brand + model + os + ramSize + strogeSize; 
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
