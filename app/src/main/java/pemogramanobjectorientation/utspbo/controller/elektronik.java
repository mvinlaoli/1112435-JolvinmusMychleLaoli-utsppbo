package pemogramanobjectorientation.utspbo.controller;
import pemogramanobjectorientation.utspbo.enums.jeniselektronik;

public abstract class elektronik {
    private jeniselektronik type;

    public elektronik(jeniselektronik type) {
        this.type = type;
    }

    public jeniselektronik getelektronik() {
        return type;
    }

    public abstract String getPrintDetail();

    

}

