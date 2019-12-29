package tk.kydev;

public class Daire {
    double PI=Math.floor(Math.PI);
    double alan,cevre,yaricap;
    public Daire(double yaricap)
    {
        this.yaricap=yaricap;
        alanHesapla();
        cevreHesapla();
    }

    public void alanHesapla()
    {
        alan=PI*yaricap*yaricap;
    }
    public void  cevreHesapla()
    {
        cevre=2*PI*yaricap;
    }
}
