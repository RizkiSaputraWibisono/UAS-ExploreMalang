package polinema.ac.id.ExploreMalang.UAS.models;

public class Info {

    private String namaInfo;
    private int gambarInfo;
    private String jarakInfo;
    private String tiketInfo;
    private String deskripsiInfo;


    public Info(String namaInfo, int gambarInfo, String jarakInfo, String tiketInfo, String deskripsiInfo) {
        this.namaInfo = namaInfo;
        this.gambarInfo = gambarInfo;
        this.jarakInfo = jarakInfo;
        this.tiketInfo = tiketInfo;
        this.deskripsiInfo = deskripsiInfo;
    }

    public Info(String coban_rondo, String s, String s1, String cobanRondo, int cobanrondo){

    }

    public Info() {

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
