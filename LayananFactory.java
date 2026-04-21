public class LayananFactory {
    public LayananStrategy create(String jenis) {
        switch (jenis) {
            case "1":
                return new CuciReguler();
            case "2":
                return new CuciSetrika();
            case "3":
                return new CuciExpress();
            default:
                return null;
        }
    }
}
