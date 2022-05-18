package TugasInheritance.ChildClass;

import TugasInheritance.Obj.Persegi;
import TugasInheritance.Services.BangunRuang;

public class Kubus extends Persegi implements BangunRuang {

    public Kubus(int sisi) {
        super(sisi);
    }

    public double getVolume() {
        return Math.pow(super.getSisi(), 3);
    }

    @Override
    public double getKeliling() {
        return 12 * super.getSisi();
    }

    @Override
    public double getLuas() {
        return 6 * super.getLuas();
    }

    @Override
    public void karakteristik() {
        System.out.println("Karakteristik kubus");
    }

    @Override
    public void menggambar() {
        System.out.println("Menggambar Kubus");
    }

}
