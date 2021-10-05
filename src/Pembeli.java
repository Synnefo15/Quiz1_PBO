import java.util.Scanner;

class Pembeli {
    // * Atribut
    private String name;
    private int usia;
    private String kelamin;
    private int uang;

    // *Objek Member
    private Hewan hewan;
    private Penjual penjual;

    // *Konstruktor
    public Pembeli(String name, int usia, String kelamin, int uang) {
        this.name = name;
        this.usia = usia;
        this.kelamin = kelamin;
        this.uang = uang;
    }

    // *Get data pembeli
    public String setName() {
        return this.name;
    }

    public int setUsia() {
        return this.usia;
    }

    public String getKelamin() {
        return this.kelamin;
    }

    public int getUang() {
        return this.uang;
    }

    // *Set data pembeli
    public void setName(String name) {
        this.name = name;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    // *setHewan
    public void setHewan(Hewan hewan) {
        this.hewan = hewan;
    }

    // *setPenjual
    public void setPenjual(Penjual penjual) {
        this.penjual = penjual;
    }

    

    // *==========Method=========//

    // *Display
    public void display() {
        System.out.println("===Pembeli===");
        System.out.println("Pembeli\t\t : " + this.name);
        System.out.println("Usia\t\t : " + this.usia);
        System.out.println("Jenis Kelamin\t : " + this.kelamin);
        System.out.println("Banyak Uang\t : " + this.uang);
        
    }

    // *Membeli
    // ?cek
    public void BeliPembeli() {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Apa anda ingin membeli hewan ? (true/false)");
        boolean inginBeli = inputUser.nextBoolean();

        if (inginBeli == true) {
            
            daftarTransaksi();

            int sisaUang = getUang() - (penjual.hargaPenjual() * 11 / 10);
            System.out.println("Selamat, anda berhasil membeli " + hewan.getName() + " dengan harga "
                    + (penjual.hargaPenjual() * 11 / 10));
            System.out.println("Uang " + getUang());
            System.out.println("Sisa uang anda " + getUang() + '-' + (penjual.hargaPenjual() * 11 / 10) + '=' + sisaUang);
        }else{
            System.out.println("Baiklah kalo tidak mau beli");
        }
    }

    public void daftarTransaksi() {
        System.out.println("=========");
        System.out.println("Transaksi dengan " + this.penjual.getName());
        System.out.println("Membeli hewan " + this.hewan.getName());
        System.out.println("=========");
    }

    public void menawar() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(" Apa anda ingin menawar ? (true/false)");
        boolean nawar = iScanner.nextBoolean();
        
        while (nawar = true) {
            int jumlahNawar = 3;
            System.out.println("Anda mau menawar berapa ? ");
            int diskon = iScanner.nextInt();
            jumlahNawar--;
            if (diskon >= (penjual.hargaPenjual() * 7 / 10) && jumlahNawar != 0) {
                System.out.println("Yang kira-kira kalau nawar mas");
            } else if (diskon >= (penjual.hargaPenjual() * 4 / 10)) {
                System.out.println("Masih belum bisa nawar segitu mas");
            } else {
                int bayar = penjual.hargaPenjual() - diskon;
                System.out.println("Ok deal mas, diskon " + diskon);
                System.out.println("sampeyan bayar : " + bayar);
                nawar = false;
                break;
            }
            System.out.println("sisa nawar " + jumlahNawar);

        }
        System.out.println("Tawar menawar selesai");
    }

    

    /**
     ** InnerPembeli berisi detail data diri pembeli
     */
    class InnerPembeli {

        String name;
        String pekerjaan;
        String status;
        int biaya;
        int usia;
        String kelamin;
        int uang;

        public InnerPembeli(String name, String pekerjaan, String status, int biaya ) {
            this.name = Pembeli.this.name + name;
            this.usia = Pembeli.this.usia;
            this.kelamin = getKelamin();
            this.uang = getUang();
            this.pekerjaan = pekerjaan;
            this.status = status;
            this.biaya= biaya;
        }

        // *Display
        public void display() {
            System.out.println("===Pembeli Detail===");
            System.out.println("Nama detail\t : " + this.name);
            System.out.println("Pekerjaan\t : " + this.pekerjaan);
            System.out.println("status\t\t : " + this.status);
            System.out.println("Usia\t\t : " + this.usia);
            System.out.println("Jenis Kelamin\t : " + this.kelamin);
            System.out.println("Banyak Uang\t : " + this.uang);
            System.out.println("Biaya yang biasa dihabiskan/belanja : " + this.biaya);
            
        }

        
    }

}
