package TugasInheritance.ChildClass;

import TugasInheritance.Obj.PersegiPanjang;

public class Balok extends PersegiPanjang {
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;

    }

    public int getVolume() {
        return super.getPanjang() * super.getLebar() * tinggi;
    }
}
