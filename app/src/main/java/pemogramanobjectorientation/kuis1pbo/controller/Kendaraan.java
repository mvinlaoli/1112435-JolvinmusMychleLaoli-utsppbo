package pemogramanobjectorientation.kuis1pbo.model;

import pemogramanobjectorientation.kuis1pbo.enums.JenisKendaraan;

public  abstract class  Kendaraan {
    private JenisKendaraan tipe;

    public Kendaraan(JenisKendaraan tipe){
        this.tipe = tipe;
    }
    public JenisKendaraan getKendaran(){
        return tipe;
    }
    public abstract String getPrintDetail();
}
