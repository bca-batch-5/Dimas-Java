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
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    @Override
    public void karakteristik() {
        System.out.println("karakter Persegi Panjang");

    }
}
