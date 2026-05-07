public class Kertas extends Produk {
    private String ukuran;

    public Kertas(String idProduk, String nama, double harga, String ukuran){
        super(idProduk, nama, harga);
        this.ukuran = ukuran;
    }
    @Override
    public void tampilkanDetail(){
        System.out.println("Nama Produk: " + getNama() + " | Harga: " + getHarga() + " | Ukuran Kertas: " + ukuran);
    }
}