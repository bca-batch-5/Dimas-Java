package TugasInheritance.ChildClass;

import TugasInheritance.Obj.PersegiPanjang;
import TugasInheritance.Services.BangunRuang;

public class Balok extends PersegiPanjang implements BangunRuang {
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;

    }

    @Override
    public double getVolume() {
        return super.getPanjang() * super.getLebar() * tinggi;
    }

    @Override
    public void karakteristik() {
        System.out.println("Karakter Balok");

    }

    @Override
    public void menggambar() {
        System.out.println("Menggambar Balok");

    }

    @Override
    public double getKeliling() {
        return 4 * (super.getPanjang() + super.getLebar() + tinggi);
    }

    @Override
    public double getLuas() {
        return 2 * ((super.getPanjang() * super.getLebar()) + (super.getPanjang() * tinggi)
                + (super.getLebar() * tinggi));
    }

}
