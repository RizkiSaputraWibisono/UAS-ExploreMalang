package polinema.ac.id.ExploreMalang.UAS.models;

public class Request {
    private String namaInfo;
    private int gambarInfo;
    private String jarakInfo;
    private String tiketInfo;
    private String deskripsiInfo;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNamaInfo() {
        return namaInfo;
    }

    public void setNamaInfo(String namaInfo) {
        this.namaInfo = namaInfo;
    }

    public int getGambarInfo() {
        return gambarInfo;
    }

    public void setGambarInfo(int gambarInfo) {
        this.gambarInfo = gambarInfo;
    }

    public String getJarakInfo() {
        return jarakInfo;
    }

    public void setJarakInfo(String jarakInfo) {
        this.jarakInfo = jarakInfo;
    }

    public String getTiketInfo() {
        return tiketInfo;
    }

    public void setTiketInfo(String tiketInfo) {
        this.tiketInfo = tiketInfo;
    }

    public String getDeskripsiInfo() {
        return deskripsiInfo;
    }

    public void setDeskripsiInfo(String deskripsiInfo) {
        this.deskripsiInfo = deskripsiInfo;
    }
}
