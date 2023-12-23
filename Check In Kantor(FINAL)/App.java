import java.util.Scanner;
import model.*;

public class App {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Aplikasi Check-in");

    boolean membuatIdKembali = true;

    while (membuatIdKembali) {
        System.out.print("Apakah ingin membuat idKaryawan? (ya / tidak): ");
        String jenisUser = scanner.nextLine().toLowerCase();

        if (jenisUser.equals("ya")) {
            System.out.print("Masukkan nama karyawan: ");
            String namaKaryawan = scanner.nextLine();
            System.out.print("Masukkan sandi anda: ");
            String sandi = scanner.nextLine();

            Karyawan karyawan = new Karyawan(namaKaryawan, sandi);
            Database.tambahKaryawan(karyawan);

            System.out.println("Berikut ID karyawan yang sudah berhasil dibuat: " + karyawan.getIdKaryawan());

            System.out.print("Apakah Anda Sudah Melakukan Registrasi Karyawan (ya/tidak): ");
            String masuk = scanner.nextLine().toLowerCase();

            if (masuk.equals("ya")) {
                System.out.print("Masukkan ID: ");
                String idKaryawan = scanner.nextLine();

                Karyawan karyawanMasuk = Database.getKaryawanById(idKaryawan);

                if (karyawanMasuk != null) {
                    karyawanMasuk.login();
                    // 
                    membuatIdKembali = false;
                } else {
                    System.out.println("Karyawan tidak ditemukan.");
                }
            } else if (masuk.equals("tidak")) {
                System.out.println("Anda memilih untuk tidak melakukan registrasi.");
                System.out.print("Apakah Anda ingin membuat ID karyawan kembali (ya/tidak): ");
                String buatKembali = scanner.nextLine().toLowerCase();

                if (!buatKembali.equals("ya")) {
                    membuatIdKembali = false;
                }
            }
        } else if (jenisUser.equals("tidak")) {
            membuatIdKembali = false;
        }
    }

    System.out.println("Terima kasih!");
    scanner.close();
}
}
