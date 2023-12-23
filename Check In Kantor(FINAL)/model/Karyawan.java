package model;

import java.util.Scanner;

public class Karyawan {
    private static int count = 1;
    String idKaryawan;
    String namaKaryawan;
    boolean isHadir;
    String sandi;

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public boolean isHadir() {
        return isHadir;
    }

    public void setHadir(boolean isHadir) {
        this.isHadir = isHadir;
    }

    public Karyawan(String namaKaryawan, String sandi) {
        this.idKaryawan = "KARYAWAN " + count++;
        this.namaKaryawan = namaKaryawan;
        this.sandi = sandi;
    }

    public void login() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Sandi: ");
            String inputSandi = scanner.nextLine();

            if (inputSandi.equals(sandi)) {
                System.out.println();
                System.out.println("=========Absensi Berhasil==========");
                System.out.println("Karyawan dengan nama " + getNamaKaryawan());
            } else {
                System.out.println("Sandi salah. Login gagal.");
              
            }
        }
    }
}