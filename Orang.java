public abstract class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    // Abstract method
    public abstract String getInfo();
}