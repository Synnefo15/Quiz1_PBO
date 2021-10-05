import java.util.Scanner;

class Penjual {
    // *Atribut
    private String name;
    private int usia;
    private String kelamin;
    private int lamaJualan;
    private int modal;

    // *Objek Member
    private Hewan hewan;
    private Peternak peternak;

    // *Konstruktor
    public Penjual(String name, int usia, String kelamin, int lamaJualan, int modal) {
        this.name = name;
        this.usia = usia;
        this.kelamin = kelamin;
        this.lamaJualan = lamaJualan;
        this.modal = modal;
    }

    // *Get data penjual
    public String getName() {
        return this.name;
    }

    public int getUsia() {
        return this.usia;
    }

    public String getKelamin() {
        return this.kelamin;
    }

    public int getLamaJualan() {
        return this.lamaJualan;
    }

    public int getModal() {
        return this.modal;
    }

    // *Set data penjual
    public void setName(String name) {
        this.name = name;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public void setLamaJualan(int lamaJualan) {
        this.lamaJualan = lamaJualan;
    }

    public void setModal(int modal) {
        this.modal = modal;
    }

    // *setHewan
    public void setHewan(Hewan hewan) {
        this.hewan = hewan;
    }

    // *setPeternak
    public void setPeternak(Peternak peternak) {
        this.peternak = peternak;
    }

    // *Display
    public void display() {
        System.out.println("===Penjual===");
        System.out.println("Penjual\t : " + this.name);
        System.out.println("Usia\t\t : " + this.usia);
        System.out.println("Jenis Kelamin\t : " + this.kelamin);
        System.out.println("Lama Berjualan\t : " + this.lamaJualan);
        System.out.println("Modal\t\t : " + this.modal);
    }

    // * membeli ke peternak

    public void Beli() {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Apa anda ingin membeli hewan pada peternak ? (true/false)");
        boolean inginBeli = inputUser.nextBoolean();

        if (inginBeli == true) {
            daftarPeternak();

            int sisaUang = getModal() - peternak.hargaJual();
            System.out.println(
                    "Selamat, anda berhasil membeli " + hewan.getName() + " dengan harga " + peternak.hargaJual());
            System.out.println("Modal " + getModal());
            System.out.println("Sisa modal anda " + getModal() + '-' + peternak.hargaJual() + '=' + sisaUang);
        }
    }

    public void daftarPeternak() {
        System.out.println("Transaksi dengan " + this.peternak.getName());

    }

    // * hitung harga jual.
    // & didapatkan dari keuntungan 10% harga beli dari peternak
    public int hargaPenjual(){
        return peternak.hargaJual() + (1/10*peternak.hargaJual());
    }

    public void berjualan() {
        Scanner inputJual = new Scanner(System.in);
        System.out.println("Anda berjualan selama berapa berapa jam ?");
        float lamaJualan = inputJual.nextFloat();

        float tenaga = 100f;
        float sisaTenaga = tenaga - (lamaJualan * 2);
        if (lamaJualan <= 3) {
            System.out.println("anda berjualan selama " + lamaJualan + " jam" + " ,Tenaga tersisa : " + sisaTenaga);
            System.out.println("masih kuat");
        } else if (lamaJualan <= 7) {
            System.out.println("anda berjualan selama " + lamaJualan + " jam" + " ,Tenaga tersisa : " + sisaTenaga);
            System.out.println("sedikit capek");
        } else if (lamaJualan <= 10) {
            System.out.println("anda berjualan selama " + lamaJualan + " jam" + " ,Tenaga tersisa : " + sisaTenaga);
            System.out.println("sudah capek");
        } else {
            System.out.println("anda berjualan selama " + lamaJualan + " jam" + " ,Tenaga tersisa : " + sisaTenaga);
            System.out.println("sudah K.O");
        }
    }

}
