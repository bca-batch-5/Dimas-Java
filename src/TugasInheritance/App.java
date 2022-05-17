package TugasInheritance;
import java.util.Scanner;
import TugasInheritance.ChildClass.Balok;
import TugasInheritance.ChildClass.Bola;
import TugasInheritance.ChildClass.Kubus;
import TugasInheritance.Obj.Lingkaran;
import TugasInheritance.Obj.Persegi;
import TugasInheritance.Obj.PersegiPanjang;

public class App {
    static Scanner input = new Scanner(System.in);
    private static int inputMenu;
    private static String inputAgain;
    private static int sisi;
    private static int panjang;
    private static int lebar;
    private static int jariJari;
    private static int tinggi;

    public static void menu() {
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.println("3.Lingkaran");
        System.out.println("4.Kubus");
        System.out.println("5.Balok");
        System.out.println("6.Bola");
        System.out.println("-------------------");
        System.out.print("Pilihan: ");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void menuBangunDatar() {
        System.out.println("1.Keliling");
        System.out.println("2.Luas");
        System.out.print("Pilihan: ");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void Pilihan() {
        do {
            menu();
            switch (inputMenu) {
                case 1:
                    System.out.println("---------------PERSEGI------------");
                    menuBangunDatar();
                    switch (inputMenu) {
                        case 1:
                            System.out.println("----------Keliling Persegi-------------");
                            System.out.print("Sisi Persegi: ");
                            sisi = input.nextInt();
                            input.nextLine();
                            Persegi persegiKel = new Persegi(sisi);
                            System.out.print("Keliling Persegi: ");
                            System.out.println(persegiKel.getKeliling());
                            break;
                        case 2:
                            System.out.println("----------Luas Persegi-------------");
                            System.out.print("Sisi Persegi: ");
                            sisi = input.nextInt();
                            input.nextLine();
                            Persegi persegiLuas = new Persegi(sisi);
                            System.out.print("Luas Persegi: ");
                            System.out.println(persegiLuas.getLuas());
                            break;
                        default:
                            System.out.println("Pilihan Tidak Ada");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("-------Persegi Panjang--------");
                    menuBangunDatar();
                    switch (inputMenu) {
                        case 1:
                            System.out.println("----------Keliling Persegi Panjang-------------");
                            System.out.print("Panjang: ");
                            panjang = input.nextInt();
                            System.out.print("Lebar: ");
                            lebar = input.nextInt();
                            PersegiPanjang persegiPanjangKel = new PersegiPanjang(panjang, lebar);
                            System.out.print("Keliling Persegi Panjang: ");
                            System.out.println(persegiPanjangKel.getKeliling());
                            input.nextLine();
                            break;

                        case 2:
                            System.out.println("----------Luas Persegi Panjang-------------");
                            System.out.print("Panjang: ");
                            panjang = input.nextInt();
                            System.out.print("Lebar: ");
                            lebar = input.nextInt();
                            PersegiPanjang persegiPanjangLuas = new PersegiPanjang(panjang, lebar);
                            System.out.print("Luas Persegi Panjang: ");
                            System.out.println(persegiPanjangLuas.getLuas());
                            input.nextLine();
                            break;

                        default:
                            System.out.println("Pilihan Tidak Ada");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("-------Lingkaran--------");
                    menuBangunDatar();
                    switch (inputMenu) {
                        case 1:
                            System.out.println("----------Keliling Lingkaran-------------");
                            System.out.print("Jari-jari : ");
                            jariJari = input.nextInt();
                            Lingkaran lingkaranKel = new Lingkaran(jariJari);
                            System.out.print("Keliling Lingkaran: ");
                            System.out.println(lingkaranKel.getKeliling());
                            input.nextLine();
                            break;

                        case 2:
                            System.out.println("----------Luas Lingkaran-------------");
                            System.out.print("Jari-jari : ");
                            jariJari = input.nextInt();
                            Lingkaran lingkaranLuas = new Lingkaran(jariJari);
                            System.out.print("Luas Lingkaran: ");
                            System.out.println(lingkaranLuas.getLuas());
                            input.nextLine();
                            break;

                        default:
                            System.out.println("Pilihan Tidak Ada");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("----------Volume Kubus-------------");
                    System.out.print("Sisi : ");
                    sisi = input.nextInt();
                    Kubus kubus = new Kubus(sisi);
                    System.out.print("Volume Kubus: ");
                    System.out.println(kubus.getVolume());
                    input.nextLine();
                    break;
                case 5:
                    System.out.println("----------Volume Balok-------------");
                    System.out.print("Panjang : ");
                    panjang = input.nextInt();
                    System.out.print("Lebar : ");
                    lebar = input.nextInt();
                    System.out.print("Tinggi : ");
                    tinggi = input.nextInt();
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    System.out.print("Volume Balok : ");
                    System.out.println(balok.getVolume());
                    input.nextLine();
                    break;
                case 6:
                    System.out.println("----------Volume Bola-------------");
                    System.out.print("Jari-Jari : ");
                    jariJari = input.nextInt();
                    Bola bola = new Bola(jariJari);
                    System.out.print("Volume Bola: ");
                    System.out.println(bola.getVolume());
                    input.nextLine();
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada");
                    break;
            }

            System.out.print("Mau mengulang Program kembali ? Y/N : ");
            inputAgain = input.nextLine();
        } while (inputAgain.equalsIgnoreCase("y"));

        input.close();
    }

    public static void main(String[] args) throws Exception {
        Pilihan();
    }
    // Persegi persegi = new Persegi(2);
    // System.out.println("---------------PERSEGI------------");
    // System.out.print("Keliling Persegi: "1);
    // System.out.println(persegi.getKeliling());
    // System.out.print("Luas Persegi: ");
    // System.out.println(persegi.getLuas());

    // PersegiPanjang persegiPanjang = new PersegiPanjang(2, 2);
    // System.out.println("-------------Persegi Panjang------------");
    // System.out.print("Keliling Persegi Panjang: ");
    // System.out.println(persegiPanjang.getKeliling());
    // System.out.print("Luas Persegi Panjang: ");
    // System.out.println(persegiPanjang.getLuas());

    // Lingkaran lingkaran = new Lingkaran(7);
    // System.out.println("-----------------Lingkaran------------------");
    // System.out.print("Keliling Lingkaran: ");
    // System.out.println(lingkaran.getKeliling());
    // System.out.print("Luas Lingkaran: ");
    // System.out.println(lingkaran.getLuas());

    // Kubus kubus = new Kubus(3);
    // System.out.println("-----------Kubus----------");
    // System.out.print("Volume Kubus: ");
    // System.out.println(kubus.getVolume());

    // Balok balok = new Balok(2,3,4);
    // System.out.println("-----------Balok----------");
    // System.out.print("Volume Balok: ");
    // System.out.println(balok.getVolume());

    // Bola bola = new Bola(7);
    // System.out.println("-----------Bola----------");
    // System.out.print("Volume Bola: ");
    // System.out.println(bola.getVolume());
}
