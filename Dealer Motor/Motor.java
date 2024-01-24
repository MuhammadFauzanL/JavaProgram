class Motor {
    String Namamerk;
    String Jenismotor;
    String Warna;
    boolean available;
        
    //Method Void
    void displayMotorDetail() {
        System.out.println("Merk " + Namamerk);
        System.out.println("Jenis Motor " + Jenismotor);
        System.out.println("Warna "+ Warna );
        System.out.println("Tersedia " + (available ? "Ya" : "tidak"));
    }

    void StokMotor() {
        if (available) {
            available = false;
            System.out.println("Pengambilan Unit Motor Berhasil.");
        } else {
            System.out.println("Maaf, stok motor tidak tersedia.");
        }
    }

 // Constructor dari sebuah file 
    Motor(String Namamerk, String Jenismotor, String Warna) {
        this.Namamerk = Namamerk;
        this.Jenismotor = Jenismotor;
        this.Warna = Warna;
        this.available = true;
        }

    }