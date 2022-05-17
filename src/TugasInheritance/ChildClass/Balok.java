package TugasInheritance.ChildClass;

import TugasInheritance.Obj.PersegiPanjang;
import TugasInheritance.Services.BangunRuang;

public class Balok extends PersegiPanjang implements BangunRuang{
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menggambar() {
        // TODO Auto-generated method stub
        
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



    
}
