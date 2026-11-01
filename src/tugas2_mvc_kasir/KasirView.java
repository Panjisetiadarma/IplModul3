package tugas2_mvc_kasir;

/**
 * View: Menangani representasi visual dan format tampilan output kepada pengguna.
 */
public class KasirView {
    public void printInfoBarang(String nama, int harga, int stok) {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang : " + stok);
    }

    public void printHeaderTransaksi() {
        System.out.println("Transaksi Pembelian");
    }

    public void printJumlahBayar(int totalBayar) {
        System.out.println("Jumlah Bayar : " + totalBayar);
    }

    public void printPeringatanStok(int stokTersedia, int permintaan) {
        System.out.println("[Error] Transaksi Ditolak: Permintaan " + permintaan + " unit melebihi stok yang ada (" + stokTersedia + " unit)!");
    }
}
