package base;

public class Produk {
    public String nama;
    public String kategori;
    public double harga;
    public int stok;

    public Produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public void tampilInfo() {
        System.out.println("Produk      : " + nama);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);
        System.out.println("-------------------");
    }
}