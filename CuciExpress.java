public class CuciExpress implements LayananStrategy {
    @Override
    public double hitungBiaya(double berat) {
        return berat * 12000;
    }

    @Override
    public String getNamaLayanan() {
        return "Cuci Express (1 Hari Jadi)";
    }
}
