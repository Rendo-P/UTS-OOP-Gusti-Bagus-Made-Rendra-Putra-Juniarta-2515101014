import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private String idPesanan;
    private List<Produk> daftarProduk;

    public Pesanan(String idPesanan) {
        this.idPesanan = idPesanan;
        this.daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk item) {
        this.daftarProduk.add(item);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHarga();
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("=== STRUK PESANAN: " + idPesanan + " ===");
        for (Produk p : daftarProduk) {
            p.tampilkanDetail();
        }
        System.out.println("------------------------------------");
    }
}