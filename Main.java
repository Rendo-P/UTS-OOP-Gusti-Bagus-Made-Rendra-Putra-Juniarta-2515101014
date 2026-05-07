public class Main {
    public static void main(String[] args) {
    
        Kertas a1 = new Kertas("A01", "Buku Gambar", 7000, "A4");
        Kreatif b1 = new Kreatif("P01", "Pensil Warna", 10000, "Semua Varian Warna");

        Pesanan p1 = new Pesanan("TRX-001");
        p1.tambahProduk(a1);
        p1.tambahProduk(b1);
        p1.cetakStruk();

        Pembayaran bayar = new Pembayaran("PAY-001", p1, 20000);
        bayar.validasiPembayaran();
    }
}