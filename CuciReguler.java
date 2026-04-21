public class CuciReguler implements LayananStrategy {
    @Override
    public double hitungBiaya(double berat) {
        return berat * 5000;
    }

    @Override
    public String getNamaLayanan() {
        return "Cuci Reguler";
    }
}
