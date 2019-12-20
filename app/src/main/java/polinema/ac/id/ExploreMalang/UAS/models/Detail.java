package polinema.ac.id.ExploreMalang.UAS.models;

public class Detail {

    private String namaDetail;
    private int gambarDetail;
    private String key;

    public Detail(String namaDetail, int gambarDetail) {
        this.namaDetail = namaDetail;
        this.gambarDetail = gambarDetail;
    }

    public Detail(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNamaDetail() {
        return namaDetail;
    }

    public void setNamaDetail(String namaDetail) {
        this.namaDetail = namaDetail;
    }

    public int getGambarDetail() {
        return gambarDetail;
    }

    public void setGambarDetail(int gambarDetail) {
        this.gambarDetail = gambarDetail;
    }
}
