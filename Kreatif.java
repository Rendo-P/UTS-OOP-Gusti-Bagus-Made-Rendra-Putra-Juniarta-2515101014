public class Kreatif extends Produk {
    private String warna;

     public Kreatif(String idProduk, String nama, double harga, String warna){
        super(idProduk, nama, harga);
        this.warna = warna;
    }
    @Override
    public void tampilkanDetail(){
        System.out.println("Nama Produk: " + getNama() + " | Harga: " + getHarga() + " | Warna Produk: " + warna);
    }
}
