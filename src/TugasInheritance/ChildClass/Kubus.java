package TugasInheritance.ChildClass;

import TugasInheritance.Obj.Persegi;
import TugasInheritance.Services.BangunRuang;

public class Kubus extends Persegi implements BangunRuang{

    public Kubus(int sisi) {
        super(sisi);
    }

    public double getVolume() {
        return Math.pow(super.getSisi(), 3);
    }

    @Override
    public double getKeliling() {
        // TODO Auto-generated method stub
        return super.getKeliling();
    }

    @Override
    public double getLuas() {
        // TODO Auto-generated method stub
        return super.getLuas();
    }

    @Override
    public void karakteristik() {
        // TODO Auto-generated method stub
        super.karakteristik();
    }

    @Override
    public void menggambar() {
        // TODO Auto-generated method stub
        super.menggambar();
    }

}
