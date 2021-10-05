import java.util.Scanner;

class Hewan {

    // * Atribut
    private String name;
    private String jenis;
    private double berat;
    private int harga;
    private boolean terjual;

    // *Konstruktor
    public Hewan(String name, String jenis, double berat, int harga) {
        this.name = name;
        this.jenis = jenis;
        this.berat = berat;
        this.harga = harga;
        this.terjual = false;
    }

    // * Get data hewan
    public String getName() {
        return this.name;
    }

    public String getJenis() {
        return this.jenis;
    }

    
    public double getBerat() {
        return this.berat;
    }

    public int getHarga() {
        return this.harga;
    }

    public boolean getTerjual() {
        return this.terjual;
    }

    // * SetData Hewan
    public void setName(String name) {
        this.name = name;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setTerjual(boolean terjual) {
        this.terjual = terjual;
    }

    // *Display
    public void display() {
        System.out.println("===Hewan===");
        System.out.println("Hewan\t\t : " + this.name);
        System.out.println("Jenis\t\t : " + this.jenis);
        System.out.println("Berat\t\t : " + this.berat);
        System.out.println("Harga\t\t : " + this.harga);
        System.out.println("Status terjual\t : " + this.terjual);
    }

    // *Makan
    // &Ketika sesudah makan, maka akan dicek apa berat bedannya sdh mencukupi atau
    // blm
    // &dihitung cukup saat berat setelah makan naik 20% dari berat awal
    public void makan() {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Apa hewan mau makan ? (true/false) ");
        boolean apaMakan = inputUser.nextBoolean();
        // ? cek ini

        if (apaMakan == true) {
            MenuMakanan();

            System.out.print("Berapa kg makannya ? ");
            int nominalMakan = inputUser.nextInt();
            Double beratAwal = berat;
            berat += nominalMakan;
            System.out.println("berat awal : " + beratAwal + ",berat akhir : " + berat);
            if (berat >= beratAwal * 6 / 5) {
                terjual = true;
                System.out.println("berat > " + beratAwal * 6 / 5 + " = lolos jual");
            } else {
                System.out.println("berat < " + beratAwal * 6 / 5 + " = tidak lolos jual");
            }
        } else {
            this.terjual = false;
            System.out.println("kalo hewan tidak makan, maka tidak bisa dijual");
        }

    }

    public void MenuMakanan() {

        daftarMenuMakanan();
        Scanner inputMakanan = new Scanner(System.in);
        System.out.println(Hewan.this.getName() + " Makannya apa ? ");
        String makan = inputMakanan.nextLine();

        switch (makan) {
            case "Rumput gajah":
                System.out.println(Hewan.this.getName() + " makan rumput gajah");
                break;
            case "Rumput teki":
                System.out.println(Hewan.this.getName() + " makan Rumput teki");
                break;
            case "Dedek":
                System.out.println(Hewan.this.getName() + " makan Dedek");
                break;
            case "Sayuran":
                System.out.println(Hewan.this.getName() + " makan Sayuran");
                break;
            default:
                break;
        }
    }

    public void daftarMenuMakanan() {
        System.out.println("===Daftar Menu Makanan===");
        System.out.println("Rumput teki\nRumput gajah\nDedek\nSayuran\n");
    }

}