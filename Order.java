public class Order {
    private String namaPelanggan;
    private double berat;
    private LayananStrategy layanan;

    public Order(String namaPelanggan, double berat, LayananStrategy layanan) {
        this.namaPelanggan = namaPelanggan;
        this.berat = berat;
        this.layanan = layanan;
    }

    public void cetakStruk() {
        System.out.println("\n=================================");
        System.out.println("          STRUK LAUNDRY          ");
        System.out.println("=================================");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Layanan        : " + layanan.getNamaLayanan());
        System.out.println("Berat Pakaian  : " + berat + " Kg");
        System.out.println("Total Biaya    : Rp " + String.format("%,.0f", layanan.hitungBiaya(berat)));
        System.out.println("=================================\n");
    }
}
