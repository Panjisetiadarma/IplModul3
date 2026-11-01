package tugas2_mvc_kasir;

import java.util.Scanner;

public class KasirMVCDemo {
    public static void main(String[] args) {
        System.out.println("=== 3.3 TUGAS 2: REFACTORING PROGRAM KASIR KE PATTERN MVC ===");
        
        // Inisialisasi Model
        Barang model = new Barang("GeForce GTX 1060Ti", 3000, 10);

        // Inisialisasi View
        KasirView view = new KasirView();

        // Inisialisasi Controller
        KasirController controller = new KasirController(model, view);

        // 1. Menampilkan Info Awal Barang
        System.out.println("--- 1. Tampilan Info Awal Barang ---");
        controller.updateView();

        // 2. Transaksi Pembelian (Simulasi Input Jumlah Barang)
        System.out.println("\n--- 2. Eksekusi Transaksi Pembelian ---");
        int qty = 3; // Pembelian 3 unit
        if (args.length > 0) {
            try {
                qty = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {}
        }
        controller.prosesTransaksi(qty);

        // 3. Menampilkan Info Barang Setelah Transaksi Selesai
        System.out.println("\n--- 3. Tampilan Info Setelah Transaksi ---");
        controller.updateView();
    }
}
