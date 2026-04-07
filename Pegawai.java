public class Pegawai extends Orang {
    private int idPegawai;
    private String jabatan;

    public Pegawai(int idPegawai, String nama, String jabatan) {
        super(nama);
        this.idPegawai = idPegawai;
        this.jabatan = jabatan;
    }

    @Override
    public String getInfo() {
        return "Pegawai ID: " + idPegawai + 
               ", Nama: " + nama + 
               ", Jabatan: " + jabatan;
    }

    public void prosesPesanan(Pesanan pesanan) {
        System.out.println("Pegawai " + nama + " (" + jabatan + ") sedang memproses pesanan nomor " + pesanan.getNomorPesanan());
        pesanan.setStatus("Diproses oleh " + nama);
    }
}