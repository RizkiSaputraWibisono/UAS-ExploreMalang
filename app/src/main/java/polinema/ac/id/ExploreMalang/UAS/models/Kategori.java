package polinema.ac.id.ExploreMalang.UAS.models;

public class Kategori {

    private String namaKategori;
    private String ketKategori;
    private int gambarKategori;

    public Kategori(String namaKategori, String ketKategori, int gambarKategori) {
        this.namaKategori = namaKategori;
        this.ketKategori = ketKategori;
        this.gambarKategori = gambarKategori;
    }

    public Kategori(){

    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public String getKetKategori() {
        return ketKategori;
    }

    public void setKetKategori(String ketKategori) {
        this.ketKategori = ketKategori;
    }


    public int getGambarKategori() {
        return gambarKategori;
    }

    public void setGambarKategori(int gambarKategori) {
        this.gambarKategori = gambarKategori;
    }
}

