import java.util.ArrayList;

public class Supermarket {
    private String namaToko;
    private ArrayList<Barang> daftarBarang;

    public Supermarket(String namaToko) {
        this.namaToko = namaToko;
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
        System.out.println(barang.getNamaBarang() + " berhasil ditambahkan ke " + namaToko);
    }

    public void tampilBarang() {
        System.out.println("\n=== DAFTAR BARANG " + namaToko.toUpperCase() + " ===");
        System.out.println("ID | Nama Barang | Harga | Stok");
        System.out.println("--------------------------------");
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada barang.");
        } else {
            for (Barang b : daftarBarang) {
                b.tampilBarang();
            }
        }
    }

    public Barang cariBarang(int idBarang) {
        for (Barang b : daftarBarang) {
            if (b.getIdBarang() == idBarang) {
                return b;
            }
        }
        System.out.println("Barang dengan ID " + idBarang + " tidak ditemukan.");
        return null;
    }
}