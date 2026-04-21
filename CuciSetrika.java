public class CuciSetrika implements LayananStrategy {
    @Override
    public double hitungBiaya(double berat) {
        return berat * 8000;
    }

    @Override
    public String getNamaLayanan() {
        return "Cuci + Setrika";
    }
}
