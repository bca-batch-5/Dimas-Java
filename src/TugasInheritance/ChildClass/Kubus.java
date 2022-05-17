package TugasInheritance.ChildClass;

import TugasInheritance.Obj.Persegi;

public class Kubus extends Persegi {

    public Kubus(int sisi) {
        super(sisi);
    }

    public double getVolume() {
        return Math.pow(super.getSisi(), 3);
    }

}
