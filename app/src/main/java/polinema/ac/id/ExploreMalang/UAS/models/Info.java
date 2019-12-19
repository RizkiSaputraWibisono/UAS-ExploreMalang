package polinema.ac.id.ExploreMalang.UAS.models;

public class Info {

    private String namaInfo;
    private int gambarInfo;

    public Info(String namaInfo, int gambarInfo) {
        this.namaInfo = namaInfo;
        this.gambarInfo = gambarInfo;
    }

    public Info(){

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
}
