package tk.kydev;

public class Users {
    private String ad;
    private String soyad;
    private String mesaj;
    private   int kullaniciId=0;
    public Users(String ad,String soyad,String mesaj,int kullaniciId)
    {
        this.ad=ad;
        this.soyad=soyad;
        this.mesaj=mesaj;
        this.kullaniciId=kullaniciId;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", Kullanıcı Id='" + kullaniciId + '\'' +
                ", mesaj='" + mesaj + '\'';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }
}
