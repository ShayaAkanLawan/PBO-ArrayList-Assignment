import java.util.ArrayList;
import java.util.Scanner;

public class BankDemo {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pause(Scanner input) {
        System.out.println("\nPress Enter to continue...");
        input.nextLine();
    }

    public static void jalankanProgram() {
        Scanner input = new Scanner(System.in);

        Bank[] daftarAkunArray = new Bank[100];
        int jumlahAkunArray = 0;

        daftarAkunArray[jumlahAkunArray] = new Bank("101", "Satria", 500000);
        jumlahAkunArray++;
        daftarAkunArray[jumlahAkunArray] = new Bank("102", "Bimo", 1000000);
        jumlahAkunArray++;


        ArrayList<Bank> daftarAkunArrayList = new ArrayList<>();

        daftarAkunArrayList.add(new Bank("201", "Faiz", 750000));
        daftarAkunArrayList.add(new Bank("202", "Bayu", 1500000));


        int pilihan;
        do {
            clearScreen();
            System.out.println("-----> DEMO ARRAY & ARRAYLIST BANK <-----\n");
            System.out.println("1. Tampilkan Akun");
            System.out.println("2. Tampilkan Akun");
            System.out.println("3. Tambah Akun Baru");
            System.out.println("4. Transaksi Deposit");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("\n=== DAFTAR AKUN (ARRAY) ===");
                for (int i = 0; i < jumlahAkunArray; i++) {
                    System.out.println((i + 1) + ". Rek: " + daftarAkunArray[i].getNoRekening() 
                            + " | Nama: " + daftarAkunArray[i].getNama() 
                            + " | Saldo: Rp " + daftarAkunArray[i].getBalance());
                }
                pause(input);

            } else if (pilihan == 2) {
                System.out.println("\n=== DAFTAR AKUN (ARRAYLIST) ===");
                for (int i = 0; i < daftarAkunArrayList.size(); i++) {
                    Bank akun = daftarAkunArrayList.get(i);
                    System.out.println((i + 1) + ". Rek: " + akun.getNoRekening() 
                            + " | Nama: " + akun.getNama() 
                            + " | Saldo: Rp " + akun.getBalance());
                }
                pause(input);

            } else if (pilihan == 3) {

                System.out.print("Masukkan No Rekening : ");
                String noRek = input.nextLine();
                System.out.print("Masukkan Nama        : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Saldo Awal  : Rp ");
                double saldo = input.nextDouble();
                input.nextLine();

                daftarAkunArrayList.add(new Bank(noRek, nama, saldo));
                System.out.println("Akun berhasil ditambahkan!");
                pause(input);

            } else if (pilihan == 4) {
                System.out.print("Masukkan No Rekening target: ");
                String noRek = input.nextLine();

                Bank akunDitemukan = null;
                for (Bank akun : daftarAkunArrayList) {
                    if (akun.getNoRekening().equals(noRek)) {
                        akunDitemukan = akun;
                        break;
                    }
                }

                if (akunDitemukan != null) {
                    System.out.print("Nominal Deposit: Rp ");
                    double nominal = input.nextDouble();
                    input.nextLine();
                    akunDitemukan.deposit(nominal);
                    System.out.println("Deposit berhasil! Saldo baru: Rp " + akunDitemukan.getBalance());
                } else {
                    System.out.println("Akun tidak ditemukan di ArrayList!");
                }
                pause(input);

            } else if (pilihan == 0) {
                System.out.println("-----> TERIMA KASIH <-----");
            } else {
                System.out.println("Menu tidak ditemukan!");
                pause(input);
            }
        } while (pilihan != 0);

        input.close();
    }
}