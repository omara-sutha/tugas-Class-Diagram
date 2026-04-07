import java.util.ArrayList;

public class Customer extends Orang {
    private int idCustomer;
    private String email;
    private String alamat;
    private ArrayList<Pesanan> daftarPesanan;

    public Customer(int idCustomer, String nama, String email, String alamat) {
        super(nama);
        this.idCustomer = idCustomer;
        this.email = email;
        this.alamat = alamat;
        this.daftarPesanan = new ArrayList<>();
    }

    @Override
    public String getInfo() {
        return "Customer ID: " + idCustomer + 
               ", Nama: " + nama + 
               ", Email: " + email + 
               ", Alamat: " + alamat;
    }

    public void buatPesanan(Pesanan pesanan) {
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan nomor " + pesanan.getNomorPesanan() + " berhasil dibuat oleh " + nama);
    }

    public void lihatPesanan() {
        System.out.println("\n=== DAFTAR PESANAN " + nama.toUpperCase() + " ===");
        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
        } else {
            for (Pesanan p : daftarPesanan) {
                p.tampilkanPesanan();
                System.out.println("------------------------");
            }
        }
    }
}