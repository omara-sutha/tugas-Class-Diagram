import java.util.Date;

public class Payment {
    private int paymentId;
    private Date tanggal;
    private double total;
    private String metode;
    private String status;

    public Payment(int paymentId, double total, String metode) {
        this.paymentId = paymentId;
        this.tanggal = new Date();
        this.total = total;
        this.metode = metode;
        this.status = "Belum dibayar";
    }

    public void prosesPayment() {
        System.out.println("Memproses pembayaran...");
        System.out.println("ID Payment: " + paymentId);
        System.out.println("Metode: " + metode);
        System.out.println("Total: Rp " + total);
        this.status = "Lunas";
        System.out.println("Pembayaran BERHASIL! Status: " + status);
    }

    public String getStatus() { return status; }
    public void tampilkanPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Total: Rp " + total);
        System.out.println("Metode: " + metode);
        System.out.println("Status: " + status);
    }
}