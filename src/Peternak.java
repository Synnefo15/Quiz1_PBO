import java.util.Scanner;

class Peternak {
    // *Atribut
    private String name;
    private int usia;
    private String kelamin;
    private int lamaTernak;

    // *Objek member
    private Hewan hewan;

    // *Konstruktor
    public Peternak(String name, int usia, String kelamin, int lamaTernak) {
        this.name = name;
        this.usia = usia;
        this.kelamin = kelamin;
        this.lamaTernak = lamaTernak;
    }

    // *Get data peternak
    public String getName() {
        return this.name;
    }

    public int getUsia() {
        return this.usia;
    }

    public String getKelamin() {
        return this.kelamin;
    }

    public int getLamaTernak() {
        return this.lamaTernak;
    }

    // *Set data peternak
    public void setName(String name) {
        this.name = name;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public void setLamaTernak(int lamaTernak) {
        this.lamaTernak = lamaTernak;
    }

    // *setHewan
    public void setHewan(Hewan hewan) {
        this.hewan = hewan;
    }

    // *======Method===========//

    // *Display
    public void display() {
        System.out.println("===Peternak===");
        System.out.println("Peternak\t : " + this.name);
        System.out.println("Usia\t\t : " + this.usia);
        System.out.println("Jenis Kelamin\t : " + this.kelamin);
        System.out.println("Lama ternak\t : " + this.lamaTernak);
        System.out.println("Beternak\t : " + this.hewan.getName());
    }

    // *Menjual hewan
    // &Hewan dapat dijual ketika sudah mau makan
    public void menjualHewan(Hewan hewan) {

        Scanner inputJual = new Scanner(System.in);
        System.out.println("\n Halo peternak " + this.name + " ,ingin menjual " + hewan.getName() + " dgn berat : "
                + hewan.getBerat() + " ? (true/false)");
        boolean menjual = inputJual.nextBoolean();

        if (menjual == true) {
            hewan.makan();
            if (this.hewan.getTerjual() == false) {
                System.out.println("Harus makan lagi");
            } else {
                System.out.println("Hewan : " + hewan.getName() + ", Status layak dijual : " + hewan.getTerjual());
                Scanner inputUser = new Scanner(System.in);
                System.out.println("Apa anda ingin menjual hewan itu ? (true/false) ");
                boolean inginJual = inputUser.nextBoolean();

                if (inginJual == true && hewan.getTerjual() == true) {
                    System.out.println("Hewan " + hewan.getName() + " telah dijual");
                    System.out.println("Penghasilan : " + hargaJual());
                    System.out.println("Laba : " + laba());
                    // menjual = true;
                } else if (inginJual == false && hewan.getTerjual() == true) {
                    System.out.println("wah anda tidak ingin uang");
                } else {
                    System.out.println("tidak memenuhi syarat");
                }
            }
        } else {
            System.out.println("Ya sudah kalo tidak mau dijual");
        }
    }

    // *hitung keuntungan.
    // &keuntunaan dipengaruhi berdasarkan lama pengalaman peternak.
    // Setiap 5 thn beternak, harga jual ditambah 5000. contoh jika peternak sdh 10
    // thn beternak, maka 10/5 = 2. jadi menambah 10.000 harga jual
    // &setiap berat hewan naik 5 kg, maka harga jual naik 10.000
    public int hargaJual() {
        int untung = hewan.getHarga() + ((int) this.lamaTernak / 5 * 5000) + ((int) hewan.getBerat() / 5 * 10000);
        return untung;
    }

    // *hitung laba
    // &laba didapat dari hargaJual - harga hewan
    public int laba() {
        int hitungLaba = hargaJual() - hewan.getHarga();
        System.out.println(hewan.getName() + "\nHarga Jual hewan\t = " + hargaJual());
        System.out.println("Harga awal \t\t = " + hewan.getHarga());
        System.out.println("Laba peternak\t\t = " + hitungLaba);
        return hitungLaba;
    }

}
