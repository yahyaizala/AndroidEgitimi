package tk.kydev;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

enum KullaniciTipi{
    Admin,SuperUser,User


}
enum Renk{
    KIRMIZI,MAVI,BEYAZ
}
public class Main {

    public static void main(String[] args) {

        double sayi=13.6;
        System.out.println("Sayımız önce =>"+sayi);
        double rounded=Math.round(sayi);//en yakın sayıya yuvarlıyor. beklenen sonuç 14
        System.out.println(sayi+ "sı rounded ile =>"+rounded+" sonucuna eşitlendi");
        double floored=Math.floor(sayi);// aşağı yuvarlıyordu beklenen sonuç 13
        System.out.println(sayi+ "sı flored ile =>"+floored+" sonucuna eşitlendi");
        double randomSayi=Math.random(); // bu 0 ile 1 arasında bir rasgele sayı üretiyor
        double sifirIle10arasi=randomSayi*10;//10 ile çarpınca 0 ile 10 arası bir sayı geldi.double olduğu için int çevirmeliyiz.
        int intdeger=(int)sifirIle10arasi; //double sayıyı integer değer cast ettik. Çevirdik
        System.out.println("Sıfır ile 10 arası rasgele bir sayı =>"+intdeger);
        //Bir başka yöntemi daha var
        //Rasgele sayı üreteci olarak Random kullanılabilir.
        Random uretec=new Random();
        //uretec.nextInt(10) 10 kadar bir sayı ver bana demek sadece int için değer girebiliriz. 10 gibi
        //uretec.nextDouble(); 0 ile 1 arasında bir double sayı verir bize
        System.out.println("Random ile gelen rasgele int değer "+uretec.nextInt(10));
        //virgülden sonra istenen kadarını almak istenirse örneğin virgülden sonra 3 hane isteyebiliriz. Genelde 2 hane istenir.
        double d=123.4556;
        BigDecimal bd = new BigDecimal(d).setScale(3, RoundingMode.FLOOR);
        d = bd.doubleValue();
        System.out.println(d);








        System.exit(0);//yukarıda çalışaca aşağı ihtiyaç yok

        KullaniciTipi kullanici=KullaniciTipi.Admin;//yeni bir kullanıcı tip oluşturdum.

        System.out.println(kullanici);



        //aşağısı çalışmasın nasıl olacak?
        //System.exit(0);programdan çıkıver sistemi kapatıyor. 1 de yazabilirsiniz.

        for(KullaniciTipi k:KullaniciTipi.values())//tüm enum ı ekrana basıyoruz.
            System.out.println(k);
        System.out.println(KullaniciTipi.values()[0]);//dizinin ilk elemanı
        KullaniciTipi[] kullaniciTipleri=
                KullaniciTipi.values();//enum ı diziye çevirebiliriz. string(metin değil)
        //BUTTONUN RENGI KIRMIZI OLSUN DESE
        //Renk.KIRMIZI bu şekilde atama yapacak

    }
}
