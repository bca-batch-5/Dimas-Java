package TugasInheritance.ChildClass;

import TugasInheritance.Obj.Lingkaran;

public class Bola extends Lingkaran {
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
}
