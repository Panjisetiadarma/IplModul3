package tugas2_mvc_kasir;

/**
 * Controller: Menghubungkan Model dan View serta mengendalikan alur logika transaksi.
 */
public class KasirController {
    private Barang model;
    private KasirView view;

    public KasirController(Barang model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public String getNamaBarang() {
        return model.getNama();
    }

    public void setNamaBarang(String nama) {
        model.setNama(nama);
    }

    public int getHargaBarang() {
        return model.getHarga();
    }

    public void setHargaBarang(int harga) {
        model.setHarga(harga);
    }

    public int getStokBarang() {
        return model.getStok();
    }

    public void setStokBarang(int stok) {
        model.setStok(stok);
    }

    public void updateView() {
        view.printInfoBarang(model.getNama(), model.getHarga(), model.getStok());
    }

    public boolean prosesTransaksi(int qty) {
        view.printHeaderTransaksi();
        System.out.println("Jumlah barang : " + qty);
        if (model.kurangiStok(qty)) {
            int total = model.hitungTotalBayar(qty);
            view.printJumlahBayar(total);
            return true;
        } else {
            view.printPeringatanStok(model.getStok(), qty);
            return false;
        }
    }
}
