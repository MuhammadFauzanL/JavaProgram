import java.util.Scanner;

public class DealerManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Dealer JAYA ABADI");

        System.out.println("Masukan Jumlah Motor yang ingin kamu masukan: ");
        int numMotor = scanner.nextInt();
        scanner.nextLine(); 

        Motor[] dealer = new Motor[numMotor];

        
        for (int i = 0; i < numMotor; i++) {
            System.out.println("Masukan Nama Merk Motor: ");
            String brand = scanner.nextLine();
            System.out.println("Masukan Jenis Motor: ");
            String type = scanner.nextLine();
            System.out.println("Masukan Warna Motor: ");
            String color = scanner.nextLine();

            dealer[i] = new Motor(brand, type, color);
        }
        System.out.println("Motor Tersedia:");
        for (int i = 0; i < numMotor; i++) {
            System.out.println("Motor ke-" + i + ":");
            dealer[i].displayMotorDetail();
            System.out.println("--------------------");
        }

      
        System.out.println("Masukan nomor motor yang ingin kamu ambil (0 sampai " + (numMotor - 1) + "): ");
        int motorIndexdipinjam = scanner.nextInt();
        scanner.nextLine(); 

        if (motorIndexdipinjam >= 0 && motorIndexdipinjam < numMotor) {
            dealer[motorIndexdipinjam].StokMotor();
        } else {
            System.out.println("Nomor motor tidak valid!");
        }

        System.out.println("Update List Motor:");
        for (int i = 0; i < numMotor; i++) {
            System.out.println("Motor ke-" + i + ":");
            dealer[i].displayMotorDetail();
            System.out.println("--------------------");
        }

        scanner.close();
    }
}
