import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SUPERMARKET ===\n");

        // Buat Supermarket
        Supermarket supermarket = new Supermarket("Superindo Jaya");

        // Tambah barang
        Barang barang1 = new Barang(101, "Indomie Goreng", 3500, 50);
        Barang barang2 = new Barang(102, "Aqua 600ml", 3000, 30);
        Barang barang3 = new Barang(103, "Pepsodent", 8000, 20);
        
        supermarket.tambahBarang(barang1);
        supermarket.tambahBarang(barang2);
        supermarket.tambahBarang(barang3);
        
        supermarket.tampilBarang();

        // Buat Customer dan Pegawai
        Customer customer = new Customer(1, "Budi Santoso", "budi@email.com", "Jl. Merdeka No.10");
        Pegawai pegawai = new Pegawai(201, "Siti Aminah", "Kasir");

        System.out.println("\n" + customer.getInfo());
        System.out.println(pegawai.getInfo());

        // Buat Pesanan
        Pesanan pesanan1 = new Pesanan(1001);
        
        // Customer memilih barang
        System.out.println("\n=== INPUT PESANAN ===");
        System.out.print("Masukkan ID Barang: ");
        int idBarang = scanner.nextInt();
        System.out.print("Masukkan Jumlah: ");
        int jumlah = scanner.nextInt();

        Barang barangDipilih = supermarket.cariBarang(idBarang);
        if (barangDipilih != null) {
            pesanan1.tambahBarang(barangDipilih, jumlah);
        }

        // Hitung total dan tampilkan pesanan
        pesanan1.hitungTotal();
        System.out.println("\n=== DETAIL PESANAN ===");
        pesanan1.tampilkanPesanan();

        // Customer buat pesanan
        customer.buatPesanan(pesanan1);
        
        // Pegawai proses pesanan
        pegawai.prosesPesanan(pesanan1);

        // Proses pembayaran
        System.out.println("\n=== PEMBAYARAN ===");
        Payment payment = new Payment(5001, pesanan1.getTotal(), "Tunai");
        payment.prosesPayment();

        // Lihat semua pesanan customer
        customer.lihatPesanan();

        scanner.close();
    }
}