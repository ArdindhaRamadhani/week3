class Produk {
    private String nama;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Abstract method (sesuai konsep PPT, harusnya abstract)
    public void tampilInfo() {
        // dikosongkan dulu (di PPT nanti dijadikan abstract)
    }

    public double hitungDiskon() {
        return harga;
    }
}

// Subclass Elektronik
class Elektronik extends Produk {
    private int garansiTahun;

    public Elektronik(String nama, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.garansiTahun = garansiTahun;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[ELEKTRONIK] " + getNama() +
                " | Rp" + getHarga() +
                " | Garansi: " + garansiTahun + " thn" +
                " | Stok: " + getStok());
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.90;
    }
}

// Subclass Makanan
class Makanan extends Produk {
    private String kedaluwarsa;

    public Makanan(String nama, double harga, int stok, String kedaluwarsa) {
        super(nama, harga, stok);
        this.kedaluwarsa = kedaluwarsa;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[MAKANAN] " + getNama() +
                " | Rp" + getHarga() +
                " | Exp: " + kedaluwarsa +
                " | Stok: " + getStok());
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.80;
    }
}

// Subclass Minuman
class Minuman extends Produk {
    private String ukuran;

    public Minuman(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[MINUMAN] " + getNama() +
                " | Rp" + getHarga() +
                " | " + ukuran +
                " | Stok: " + getStok());
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.95;
    }
}

// Main class
public class AbstrackProduk {
    public static void main(String[] args) {

        Elektronik laptop = new Elektronik("Laptop Asus", 8500000, 10, 2);
        Makanan indomie = new Makanan("Indomie Goreng", 3500, 100, "2026-12-01");
        Minuman esTeh = new Minuman("Es Teh Manis", 5000, 50, "500ml");

        laptop.tampilInfo();
        indomie.tampilInfo();
        esTeh.tampilInfo();

        System.out.println("\n=== Harga Setelah Diskon ===");
        System.out.println("Laptop: Rp" + laptop.hitungDiskon());
        System.out.println("Indomie: Rp" + indomie.hitungDiskon());
        System.out.println("Es Teh: Rp" + esTeh.hitungDiskon());
    }
}