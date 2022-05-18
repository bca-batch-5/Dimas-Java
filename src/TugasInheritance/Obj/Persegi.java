package TugasInheritance.Obj;

import TugasInheritance.Services.BangunDatar;

public class Persegi implements BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public double getKeliling() {
        return Math.round(4 * sisi);
    }

    public double getLuas() {
        return Math.round(sisi * sisi);
    }

    @Override
    public void menggambar() {
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    @Override
    public void karakteristik() {
        System.out.println("Karakteristik Persegi");

    }
}
