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
        return 4 * super.getPhi() * Math.pow(super.getJariJari(), 3) / 3;
    }

    @Override
    public double getLuas() {
        return 4 * super.getPhi() * Math.pow(super.getJariJari(), 2);
    }

    @Override
    public void karakteristik() {
        System.out.println("karakteristik Bola");
    }

    @Override
    public void menggambar() {
        System.out.println("menggambar Bola");
    }
}
