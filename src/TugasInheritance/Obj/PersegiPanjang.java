package TugasInheritance.Obj;

import TugasInheritance.Services.BangunDatar;

public class PersegiPanjang implements BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public void menggambar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void karakteristik() {
        // TODO Auto-generated method stub
        
    }
}
