import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LayananFactory factory = new LayananFactory();

        System.out.println("=== SISTEM LAYANAN LAUNDRY ===");
        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Berat Pakaian (Kg): ");
        double berat = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nPilih Jenis Layanan:");
        System.out.println("1. Cuci Reguler (Rp 5.000/Kg)");
        System.out.println("2. Cuci + Setrika (Rp 8.000/Kg)");
        System.out.println("3. Cuci Express (Rp 12.000/Kg)");
        System.out.print("Masukkan pilihan (1/2/3): ");
        String pilihan = scanner.nextLine();

        LayananStrategy layanan = factory.create(pilihan);

        if (layanan != null) {
            Order order = new Order(nama, berat, layanan);
            order.cetakStruk();
        } else {
            System.out.println("\n[ERROR] Pilihan layanan tidak valid! Silakan coba lagi.");
        }

        scanner.close();
    }
}
