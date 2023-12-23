package model;
import java.util.HashMap;
import java.util.Map;


public class Database {
    private static Map<String, Karyawan> dataKaryawan = new HashMap<>();

    public static void tambahKaryawan(Karyawan Karyawan) {
        dataKaryawan.put(Karyawan.getIdKaryawan(), Karyawan);
    }

    public static Karyawan getKaryawanById(String idKaryawan) {
        return dataKaryawan.get(idKaryawan);
    }

    public static void tampilkanDataKaryawan() {
        System.out.println("Data Karyawan:");
        for (Map.Entry<String, Karyawan> entry : dataKaryawan.entrySet()) {
            Karyawan Karyawan = entry.getValue();
            System.out.println("ID Karyawan: " + Karyawan.getIdKaryawan());
            System.out.println("Username: " + Karyawan.getNamaKaryawan());

            System.out.println("------------------------");
        }
    }

    public static void tampilkanDataKaryawanById(String idKaryawan) {
        Karyawan Karyawan = dataKaryawan.get(idKaryawan);
        if (Karyawan != null) {
            System.out.println("Data Karyawan:");
            System.out.println("ID Karyawan: " + Karyawan.getIdKaryawan());
            System.out.println("Username: " + Karyawan.getNamaKaryawan());

            System.out.println("------------------------");
        } else {
            System.out.println("Karyawan tidak ditemukan.");
        }
    }
}