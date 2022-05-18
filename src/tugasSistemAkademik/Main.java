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
    private static String pilihan;
    private static String matKul;
    private static int sks;
    static List<Person> persons = new ArrayList<>();

    public static void tambahMatKul() {
        do {
            System.out.println("-------------Masukkan Mata Kuliah yang diambil!----------------");
            System.out.print("Mata Kuliah :");
            matKul = scan.nextLine();
            System.out.print("Jumlah SKS :");
            sks = scan.nextInt();
            scan.nextLine();
            System.out.print("Apakah anda ingin menambahkan matkul kembali? Y/N : ");
            pilihan = scan.nextLine();
        } while (pilihan.equalsIgnoreCase("y"));
        System.out.println("Mata Kuliah dan SKS telah ditambahkan!");
        System.out.println("------------------------------------------");
    }

    public static void sistemAkademik() {
        do {
            System.out.println("---------Program Sistem Akademik------------");
            System.out.println("Masukkan Data Diri!");
            System.out.print("First Name: ");
            firstName = scan.nextLine();
            System.out.print("Last Name: ");
            lastName = scan.nextLine();
            System.out.print("Address: ");
            address = scan.nextLine();
            tambahMatKul();
            Person person = new Person(firstName, lastName, address, matKul, sks);
            persons.add(person);
            System.out.print("Apakah ingin memasukkan data kembali? Y/N : ");
            option = scan.nextLine();
        } while (option.equalsIgnoreCase("y"));

        for (Person data : persons) {
            System.out.println(data);
        }
        scan.close();
    }

    public static void main(String[] args) {
        sistemAkademik();

    }
}
