package TugasInheritance.ChildClass;

import TugasInheritance.Obj.Lingkaran;
import TugasInheritance.Services.BangunRuang;

public class Bola extends Lingkaran implements BangunRuang {
    public Bola(double jariJari) {
        super(jariJari);
    }

    public double getVolume() {
        if (super.getJariJari() % 7 == 0) {
            return Math.round(4 * super.getPhi() * Math.pow(super.getJariJari(), 3) / 3);

        } else {
            return 4 * super.getPhi() * Math.pow(super.getJariJari(), 3) / 3;
        }
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
