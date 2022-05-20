package tugasKasir.Services;

import tugasKasir.Obj.Menu;

public class KasirImpl extends Menu implements Kasir {

    public KasirImpl() {
    }

    public KasirImpl(int ayamGeprek, int ayamBakar, int esteh, int lemon) {
        super(ayamGeprek, ayamBakar, esteh, lemon);
    }

    @Override
    public int getTotalBayar() {
        return ((10000 * getAyamBakar()) + (10000 * getAyamGeprek()) + (5000 * getEsteh()) + (5000 * getLemon()));
    }

    @Override
    public double getPPN() {
        return getTotalBayar() * 0.11;
    }

    @Override
    public double getKembalian(int pembayaran) {
        return pembayaran - (getTotalBayar() + getPPN());
    }

}
