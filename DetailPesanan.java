public class DetailPesanan {
    private Barang barang;
    private int jumlah;
    private double hargaSatuan;
    private double subtotal;

    public DetailPesanan(Barang barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
        this.hargaSatuan = barang.getHarga();
        this.subtotal = hitungSubtotal();
    }

    public double hitungSubtotal() {
        this.subtotal = jumlah * hargaSatuan;
        return subtotal;
    }

    public Barang getBarang() { return barang; }
    public int getJumlah() { return jumlah; }
    public double getSubtotal() { return subtotal; }

    public void tampilDetail() {
        System.out.println("  - " + barang.getNamaBarang() + 
                           " x" + jumlah + 
                           " @ Rp " + hargaSatuan + 
                           " = Rp " + subtotal);
    }
}