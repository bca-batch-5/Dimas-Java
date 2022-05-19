package tugasSistemAkademik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tugasSistemAkademik.Obj.Person;

public class Main {
    static Scanner scan = new Scanner(System.in);
    private static String firstName;
    private static String lastName;
    private static String address;
    private static String option;
    private static int pilihan;
    private static String matKul;
    private static int pilMenu;
    private static int sks;
    private static int jumlahSKS = 0;
    static List<String> persons = new ArrayList<>();
    static List<List<String>> listPersons = new ArrayList<>();

    public static void menu() {
        System.out.println("---------Program Sistem Akademik------------");
        System.out.println("1. Registrasi Mahasiswa");
        System.out.println("2. Melihat data Mahasiswa");
        System.out.println("3. Input KRS");
        System.out.println("4. Lihat status mahasiswa");
    }

    public static void inputMahasiswa() {
        System.out.println("Masukkan Data Diri!");
        System.out.print("First Name: ");
        firstName = scan.nextLine();
        System.out.print("Last Name: ");
        lastName = scan.nextLine();
        System.out.print("Address: ");
        address = scan.nextLine();
        Person person = new Person(firstName, lastName, address, matKul, jumlahSKS);
        persons.add(person.getFullName());
        persons.add(person.getAddress());
        listPersons.add(persons);
        persons = new ArrayList<>();
        System.out.println("Data Mahasiswa berhasil ditambahkan!");
    }

    public static void tambahMatKul() {
        System.out.println("-----------------------Input KRS---------------------------");
        System.out.print("Masukkan Nomor mahasiswa : ");
        pilihan = scan.nextInt();
        scan.nextLine();
        do {
            System.out.println("-------------Masukkan Mata Kuliah yang diambil!----------------");
            System.out.print("Mata Kuliah : ");
            matKul = scan.nextLine();
            System.out.print("Jumlah SKS : ");
            sks = scan.nextInt();
            scan.nextLine();
            jumlahSKS = jumlahSKS + sks;
            System.out.print("Apakah anda ingin menambahkan matkul kembali? Y/N : ");
            option = scan.nextLine();
        } while (option.equalsIgnoreCase("y"));
        listPersons.get(pilihan).add(Integer.toString(jumlahSKS));
        System.out.println(jumlahSKS);
        jumlahSKS = 0;
        System.out.println("Mata Kuliah dan SKS telah ditambahkan!");
        System.out.println("------------------------------------------");
    }

    public static void sistemAkademik() {
        do {
            menu();
            System.out.print("Masukkan pilihan anda : ");
            pilMenu = scan.nextInt();
            scan.nextLine();
            switch (pilMenu) {
                case 1:
                    inputMahasiswa();
                    break;
                case 2:
                    System.out.print("Masukkan nomor Mahasiswa: ");
                    pilihan = scan.nextInt();
                    scan.nextLine();
                    for (String list : listPersons.get(pilihan)) {
                        System.out.println(list);
                    }
                    break;
                case 3:
                    tambahMatKul();
                    break;
                case 4:
                    System.out.print("Masukkan nomor mahasiswa : ");
                    pilihan = scan.nextInt();
                    scan.nextLine();
                    listPersons.get(pilihan);
                    if(Integer.parseInt(listPersons.get(pilihan).get(2)) >= 144){
                        System.out.println(listPersons.get(pilihan).get(0) +" "+ "S.Kom");
                        } else {
                        System.out.println(listPersons.get(pilihan).get(0));
                        }
                        System.out.println("Total SKS : " + listPersons.get(pilihan).get(2));
                    if (Integer.parseInt(listPersons.get(pilihan).get(2)) >= 144) {
                        System.out.println("Status : Lulus");
                    }else{
                        System.out.println("Status : Belum Lulus");
                    }
                    break;
                default:
                    System.out.println("Menu tidak ditemukan!");
                    break;
                }
            System.out.print("Apakah anda ingin mengakses program kembali? Y/N : ");
            option = scan.nextLine();
        } while (option.equalsIgnoreCase("y"));
        scan.close();
    }

    public static void main(String[] args) {
        sistemAkademik();

    }
}
