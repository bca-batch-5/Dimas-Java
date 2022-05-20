package tugasKasir;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import tugasKasir.Services.KasirImpl;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static int pilihan;
    private static String option;
    private static int AyamGeprek = 0;
    private static int AyamBakar = 0;
    private static int Esteh = 0;
    private static int Lemon = 0;
    private static int AyamGeprekInput;
    private static int AyamBakarInput;
    private static int EstehInput;
    private static int LemonInput;
    private static int AyamGeprekTotal;
    private static int AyamBakarTotal;
    private static int EstehTotal;
    private static int LemonTotal;
    private static int pembayaran;
    private static List<Integer> order = new ArrayList<>();
    private static Date date = new Date() ;

    public static void menuAwal() {
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
    }

    public static void menuMakanan() {
        System.out.println("1.Ayam Geprek");
        System.out.println("2.Ayam Bakar");
    }

    public static void menuMinuman() {
        System.out.println("1.Es Teh");
        System.out.println("2.Lemon");
    }

    public static void kasir() {
        order.add(AyamGeprek);
        order.add(AyamBakar);
        order.add(Esteh);
        order.add(Lemon);
        do {
            System.out.println("---------Pilihan Menu--------------");
            menuAwal();
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    menuMakanan();
                    System.out.print("Masukkan pilihan anda : ");
                    pilihan = input.nextInt();
                    input.nextLine();
                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan Jumlah Pesanan Anda: ");
                            AyamGeprekInput = input.nextInt();
                            input.nextLine();
                            AyamGeprekTotal = +AyamGeprekInput;
                            order.set(0, AyamGeprekTotal);
                            break;
                        case 2:
                            System.out.print("Masukkan Jumlah Pesanan Anda: ");
                            AyamBakarInput = input.nextInt();
                            input.nextLine();
                            AyamBakarTotal = +AyamBakarInput;
                            order.set(1, AyamBakarTotal);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    menuMinuman();
                    System.out.print("Masukkan pilihan anda : ");
                    pilihan = input.nextInt();
                    input.nextLine();
                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan Jumlah Pesanan Anda: ");
                            EstehInput = input.nextInt();
                            input.nextLine();
                            EstehTotal = +EstehInput;
                            order.set(2, EstehTotal);
                            break;
                        case 2:
                            System.out.print("Masukkan Jumlah Pesanan Anda: ");
                            LemonInput = input.nextInt();
                            input.nextLine();
                            LemonTotal = +LemonInput;
                            order.set(3, LemonTotal);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("Menu Tidak Ada!");
                    break;
            }
            System.out.print("Apakah anda ingin menambah pesanan? Y/N : ");
            option = input.nextLine();
        } while (option.equalsIgnoreCase("y"));
        KasirImpl kasir = new KasirImpl(order.get(0), order.get(1), order.get(2), order.get(3));
        System.out.println("Total Pembayaran + PPN :" + (kasir.getTotalBayar() + kasir.getPPN()));
        do {
            System.out.print("Pembayaran : ");
            pembayaran = input.nextInt();
            input.nextLine();
            if (pembayaran < (kasir.getTotalBayar() + kasir.getPPN())) {
                System.out.println("Uang yang anda bayarkan kurang");
            } else {
                System.out.println("Kembalian : " + kasir.getKembalian(pembayaran));
            }
        } while (pembayaran < (kasir.getTotalBayar() + kasir.getPPN()));
        System.out.println("---------------Receipt------------------");
        System.out.println();
        System.out.println( date.toString());
        System.out.println();
        System.out.println("Ayam Geprek = " + order.get(0));
        System.out.println("Ayam Bakar = " + order.get(1));
        System.out.println("Es Teh = " + order.get(2));
        System.out.println("Lemon = " + order.get(3));
        System.out.println("Total Pembayaran + PPN :" + (kasir.getTotalBayar() + kasir.getPPN()));
        System.out.println("Uang yang dibayarkan : "+ pembayaran);
        System.out.println("Kembalian : " + kasir.getKembalian(pembayaran));
        System.out.println("---------------------------------------------");
        input.close();
    }

    public static void main(String[] args) {
        kasir();
    }
}
