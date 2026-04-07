import java.util.ArrayList;
import java.util.Date;

public class Pesanan {
    private int nomorPesanan;
    private Date tanggal;
    private double total;
    private String status;
    private ArrayList<DetailPesanan> daftarDetail;

    public Pesanan(int nomorPesanan) {
        this.nomorPesanan = nomorPesanan;
        this.tanggal = new Date(); // otomatis tanggal sekarang
        this.total = 0;
        this.status = "Menunggu pembayaran";
        this.daftarDetail = new ArrayList<>();
    }

    public int getNomorPesanan() { return nomorPesanan; }
    public double getTotal() { return total; }
    public void setStatus(String status) { this.status = status; }

    public void tambahBarang(Barang barang, int jumlah) {
        if (barang.getStok() >= jumlah) {
            DetailPesanan detail = new DetailPesanan(barang, jumlah);
            daftarDetail.add(detail);
            barang.kurangiStok(jumlah);
            hitungTotal();
            System.out.println(jumlah + " " + barang.getNamaBarang() + " ditambahkan ke pesanan.");
        } else {
            System.out.println("Stok " + barang.getNamaBarang() + " tidak mencukupi!");
        }
    }

    public double hitungTotal() {
        total = 0;
        for (DetailPesanan d : daftarDetail) {
            total += d.getSubtotal();
        }
        return total;
    }

    public void tampilkanPesanan() {
        System.out.println("Nomor Pesanan: " + nomorPesanan);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Status: " + status);
        System.out.println("Detail Barang:");
        if (daftarDetail.isEmpty()) {
            System.out.println("  (Belum ada barang)");
        } else {
            for (DetailPesanan d : daftarDetail) {
                d.tampilDetail();
            }
        }
        System.out.println("Total: Rp " + total);
    }
}