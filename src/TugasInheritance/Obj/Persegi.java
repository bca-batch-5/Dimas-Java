package TugasInheritance.Obj;

import TugasInheritance.Services.BangunDatar;

public class Persegi implements BangunDatar{
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
        System.out.println("Gambar Persegi");
    }

    @Override
    public void karakteristik() {
        System.out.println("Karakteristik Persegi");
        
    }
}
