package tugasKasir.Obj;

public class Menu {
    private int AyamGeprek;
    private int AyamBakar;
    private int Esteh;
    private int Lemon;

    public Menu() {
    }

    public int getAyamGeprek() {
        return AyamGeprek;
    }

    public Menu(int ayamGeprek, int ayamBakar, int esteh, int lemon) {
        AyamGeprek = ayamGeprek;
        AyamBakar = ayamBakar;
        Esteh = esteh;
        Lemon = lemon;
    }

    public void setAyamGeprek(int ayamGeprek) {
        AyamGeprek = ayamGeprek;
    }

    public int getAyamBakar() {
        return AyamBakar;
    }

    public void setAyamBakar(int ayamBakar) {
        AyamBakar = ayamBakar;
    }

    public int getEsteh() {
        return Esteh;
    }

    public void setEsteh(int esteh) {
        Esteh = esteh;
    }

    public int getLemon() {
        return Lemon;
    }

    public void setLemon(int lemon) {
        Lemon = lemon;
    }
}
