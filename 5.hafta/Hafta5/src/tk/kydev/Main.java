package tk.kydev;

import tk.kydev.Hayvan.Hayvan;
import tk.kydev.Hayvan.Kopek;
import tk.kydev.Hayvan.Kus;
import tk.kydev.Models.Otobus;
import tk.kydev.Models.Otomobil;
import tk.kydev.Models.YakitTipi;
import tk.kydev.Shape.Dikdortgen;
import tk.kydev.Shape.Kare;


public class Main {

    void IlkCalisin()
    {
        Otomobil mOtomobil=new Otomobil();
        mOtomobil.setAracAdi("Toyota");
        mOtomobil.setYakiTipi(YakitTipi.DIZEL);
        System.out.println(mOtomobil.getAracAdi());
        System.out.println(mOtomobil.getYakiTipi().toString());

        Otobus mOtobus=new Otobus();
        mOtobus.setKorukSayisi(1);
        System.out.println("Otobusun körük sayısı :"+mOtobus.getKorukSayisi());


    }
    void IkinciCalisan()
    {
        Dikdortgen mKare=new Kare(12);

        System.out.println(mKare.alanHesapla());
        System.out.println(mKare.cevreHesapla());
    }
    void UcunuCalisan()
    {

        Kopek k9=new Kopek("K9","Labrador");
        Kopek pitbull=new Kopek("Karabaş","Pitbull");

        k9.sesCikar();
        pitbull.sesCikar();

        Kus aydin=new Kus("Aydın","Serçe");
        aydin.sesCikar();
        pitbull.kediYakala();

        Hayvan yeniPitbull=new Kopek("çaki","Pitbull");

    }

    public static void main(String[] args) {
	// write your code here



    }
}
