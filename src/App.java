import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("M.Rafi Cahyaputra/192410101029");
        System.out.println("=====Start=====");

        // * membuat objek peternak
        Peternak peternak1 = new Peternak("rafi", 19, "pria", 10);
        Peternak peternak2 = new Peternak("gilang", 21, "pria", 5);

        // * membuat objek hewan
        Hewan hewan1 = new Hewan("onta", "mamalia", 40, 230000);
        Hewan hewan2 = new Hewan("kuda", "mamalia", 70, 100000);

        // * membuat objek Penjual
        Penjual penjual1 = new Penjual("Komar", 30, "pria", 4, 20000000);
        Penjual penjual2 = new Penjual("Juna", 45, "pria", 11, 40000000);

        // *membuat objek Pembeli
        Pembeli pembeli1 = new Pembeli("Radit", 10, "pria", 10000000);
        Pembeli pembeli2 = new Pembeli("Bimo", 18, "pria", 50000000);

        // * membuat objek detail pembeli
        Pembeli.InnerPembeli pembeli1Detail = pembeli1.new InnerPembeli(" Cahya", "Pegawai", "menikah", 70000);
        Pembeli.InnerPembeli pembeli2Detail = pembeli2.new InnerPembeli(" Sugeng", "Pengusaha", "Jomblo", 300000);
        // pembeliKhusus.display();

        // #==============================

        // * memasangkan peternak dan hewan
        peternak1.setHewan(hewan1);
        peternak2.setHewan(hewan2);

        // * memasangkan penjual
        penjual1.setHewan(hewan1);
        penjual1.setPeternak(peternak1);
        penjual2.setHewan(hewan1);
        penjual2.setPeternak(peternak2);

        // *Memasangkan pembeli
        pembeli1.setHewan(hewan1);
        pembeli1.setPenjual(penjual1);

        // #==============================

        // *aktivitas

        // #==============================

        // * menampilkan data

        // # Main Menu
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("===Menu Utama===\nAnda ingin melihat fitur apa ?");
            System.out.println("1.\tPeternak");
            System.out.println("2.\tHewan");
            System.out.println("3.\tPembeli");
            System.out.println("4.\tPenjual");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("Peternak");
                    System.out.println("=================");
                    System.out.println("Pilih menu pada peternak :");
                    System.out.println("1.\tDisplay");
                    System.out.println("2.\tMenjual hewan");
                    System.out.print("\n\nPilihan anda: ");
                    String menuPeternak = terminalInput.next();
                    switch (menuPeternak) {
                        case "1":
                            peternak1.display();
                            peternak2.display();
                            break;
                        case "2":
                            peternak1.menjualHewan(hewan1);
                            break;
                        default:
                            System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-2]");
                    }
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("Hewan");
                    System.out.println("=========");
                    System.out.println("Pilih menu pada Hewan :");
                    System.out.println("1.\tDisplay");
                    System.out.println("2.\tMenu Makanan");
                    System.out.println("3.\tMakan");
                    System.out.print("\n\nPilihan anda: ");
                    String menuHewan = terminalInput.next();
                    switch (menuHewan) {
                        case "1":
                            hewan1.display();
                            hewan2.display();
                            break;
                        case "2":
                            hewan1.daftarMenuMakanan();
                            break;
                        case "3":
                            hewan1.makan();
                            break;
                        default:
                            System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");

                    }
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("Pembeli");
                    System.out.println("================");
                    System.out.println("Pilih menu pada Pembeli :");
                    System.out.println("1.\tDisplay");
                    System.out.println("2.\tBeli ke penjual");
                    System.out.println("3.\tMenawar");
                    System.out.print("\n\nPilihan anda: ");
                    String menuPembeli = terminalInput.next();
                    switch (menuPembeli) {
                        case "1":
                            pembeli1.display();
                            pembeli2.display();
                            System.out.println("Ingin menampilkan detail ?");
                            Boolean tampilkan = terminalInput.nextBoolean();
                            if (tampilkan == true) {
                                System.out.println("Detail pembeli berapa yang ingin dilihat ?");
                                String detail = terminalInput.next();
                                switch (detail) {
                                    case "1":
                                        pembeli1Detail.display();
                                        break;
                                    case "2":
                                        pembeli2Detail.display();
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case "2":
                            pembeli1.BeliPembeli();
                            break;
                        case "3":
                            pembeli1.menawar();
                            break;
                        default:
                            System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-4]");

                    }
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("Penjual");
                    System.out.println("==============");
                    System.out.println("Pilih menu pada Pembeli :");
                    System.out.println("1.\tDisplay");
                    System.out.println("2.\tBeli ke peternak");
                    System.out.println("3.\tWaktu Kerja");
                    System.out.print("\n\nPilihan anda: ");
                    String menuPenjual = terminalInput.next();
                    switch (menuPenjual) {
                        case "1":
                            penjual1.display();
                            penjual2.display();
                            break;
                        case "2":
                            penjual1.Beli();
                            break;
                        case "3":
                            penjual1.berjualan();
                            break;
                        default:
                            System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");

                    }
                    break;

                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-4]");
            }

            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }
    }

    private static boolean getYesorNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }
}
