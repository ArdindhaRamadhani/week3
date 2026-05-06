import base.Produk;

public class Makanan extends Produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }

    @Override
    public void tampilInfo() {
        System.out.println("makanan");
        super.tampilInfo();
        System.out.println("Expired: " + expired + " hari");
    }

    public void setExpired(int expired) {
        if (expired <= 0) {
            System.out.println("Expired harus lebih dari 0");
        } else {
            this.expired = expired;
        }
    }

    public void setExpired(int expired, String type) {
        if ("nasi".equals(type)) {
            if (expired < 4) {
                System.out.println("Expired harus lebih dari 4");
            } else {
                this.expired = expired;
            }
        }
    }
}