package TugasInheritance.Obj;

import TugasInheritance.Services.BangunDatar;

public class Lingkaran implements BangunDatar {
    private double jariJari;
    private final double phi = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getPhi() {
        return phi;
    }

    public double getKeliling() {
        if (jariJari % 7 == 0) {
            return Math.round(2 * phi * jariJari);
        } else {
            return 2 * phi * jariJari;
        }
    }

    public double getLuas() {
        if (jariJari % 7 == 0) {
            return Math.round(phi * jariJari * jariJari);

        } else {
            return phi * jariJari * jariJari;
        }
    }

    @Override
    public void menggambar() {
        System.out.println("Gambar Lingkaran");
        
    }

    @Override
    public void karakteristik() {
        System.out.println("karakter lingkaran");
        
    }
}
