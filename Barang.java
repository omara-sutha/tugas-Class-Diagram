public class Barang {
    private int idBarang;
    private String namaBarang;
    private double harga;
    private int stok;

    public Barang(int idBarang, String namaBarang, double harga, int stok) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public int getIdBarang() { return idBarang; }
    public String getNamaBarang() { return namaBarang; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    // Setter stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }

    public void tampilBarang() {
        System.out.println(idBarang + " | " + namaBarang + " | Rp " + harga + " | Stok: " + stok);
    }
}