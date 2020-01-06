package tk.kydev.Models;


public class Arac {
    String aracAdi;//default
    String aracPlaka;
    String silindirHacmi;
    YakitTipi yakiTipi;

    public String getAracAdi() {
        return aracAdi;
    }

    public void setAracAdi(String aracAdi) {
        this.aracAdi = aracAdi;
    }

    public String getAracPlaka() {
        return aracPlaka;
    }

    public void setAracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public String getSilindirHacmi() {
        return silindirHacmi;
    }

    public void setSilindirHacmi(String silindirHacmi) {
        this.silindirHacmi = silindirHacmi;
    }

    public YakitTipi getYakiTipi() {
        return yakiTipi;
    }

    public void setYakiTipi(YakitTipi yakiTipi) {
        this.yakiTipi = yakiTipi;
    }
}



