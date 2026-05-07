public class Pembayaran {
    private String idPembayaran;
    private Pesanan pesanan;
    private double uangBayar;

    public Pembayaran(String idPembayaran, Pesanan pesanan, double uangBayar) {
        this.idPembayaran = idPembayaran;
        this.pesanan = pesanan;
        this.uangBayar = uangBayar;
    }

    public void validasiPembayaran() {
        double totalTagihan = pesanan.hitungTotal();
        System.out.println("Total Tagihan : Rp" + totalTagihan);
        System.out.println("Uang Dibayar  : Rp" + uangBayar);

        if (uangBayar >= totalTagihan) {
            double kembalian = uangBayar - totalTagihan;
            System.out.println("Status        : BERHASIL");
            System.out.println("Kembalian     : Rp" + kembalian);
        } else {
            System.out.println("Status        : GAGAL (Uang Kurang)");
        }
    }
}