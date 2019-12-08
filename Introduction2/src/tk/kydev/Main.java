package tk.kydev;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
enum Kullanicilar{
    Admin,SuperUser,User
}

public class Main {


    public static void main(String[] args) {

        String admin="Admin";
        String user="User";
        Kullanicilar k=Kullanicilar.Admin;
        String superUser="SuperUser";
        System.out.println(admin=="_admin");


	// write your code here
        //bir değişkenin etki alanı parantez içindedir.
       /* {
        int a=24;
        int b=35;
        System.out.println(a+"  ile "+b+" nin toplamı ="+(a+b));
        }
        int a=3;//ctrl+D aynı satırı aşağıya kopyalar.
        System.out.println(a);*/
       String info="Benim adım \"yahya\"";
       /*
       \t bir tap kadar sağa kaya
       \n yeni satır oluşturu.

        System.out.println(info);
        String info2="ben 12 yaşında iken \nali 34 yaşındaydı.\n";
        String bilanco="Adet\t Ürün adı\t fiyat\n";
        String urun="12\t Bez bebek\t 125 tl";
        System.out.print(info2);
        System.out.print(bilanco);
        System.out.print(urun);
        System.out.println("");
        String musteri="Ahmet Çelik";
        System.out.println(musteri.toUpperCase());
        System.out.println(musteri.toLowerCase());
        System.out.println(musteri.startsWith("Y"));//false
        System.out.println(musteri.endsWith("k"));//false
        musteri=musteri.replace(" ","-");
        musteri=musteri.replace("Ahmet","Mehmet");
        String musteri2="şule çelik";
        System.out.println(musteri2.charAt(0));
        System.out.println(musteri2.substring(0,2));
        String  kullaniciAdi="     yasin     l";
        kullaniciAdi=kullaniciAdi.trim();

        System.out.println(kullaniciAdi);






        String merhaba="Merhaba";
        String hello="Hello";
        String  merhaba2="Merhaba";

        System.out.println(merhaba.equals(hello));
        System.out.println(merhaba==merhaba2);
        System.out.println(merhaba.equals(merhaba2));
        System.out.println(merhaba.compareTo(merhaba2));
        System.out.println(merhaba.compareTo(hello));
        System.out.println(hello.compareTo(merhaba));

        Date yilBilgisi=new Date();
        System.out.println(yilBilgisi.toString());//güncel tarih
        System.out.println(yilBilgisi.getDate());//ayın gününü getir
        System.out.println(yilBilgisi.getYear());//yılı getir.
        System.out.println(yilBilgisi.getHours());//saati
        System.out.println(yilBilgisi.getDay());
        Date bugun =new Date(2019,12,8,19,55);

        System.out.println(bugun.toString());//güncel tarih
        System.out.println(bugun.getDate());//günü getir
        System.out.println(bugun.getYear());//yılı getir.
        System.out.println(bugun.getHours());//saati
        System.out.println(bugun.getDay());
        System.out.println(bugun.getTime());
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        System.out.println("Bugun aralığın  "+gregorianCalendar.get(Calendar.DATE));
        System.out.println("günlerde "+gregorianCalendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("yıldan  "+gregorianCalendar.get(Calendar.YEAR));

        Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
        System.out.println(simpleDateFormat.format(d));*/

      /* GregorianCalendar gregorianCalendar = new GregorianCalendar();
       gregorianCalendar.add(Calendar.YEAR,10);
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        String adim="mertcan bakır";
        System.out.println(adim.toUpperCase());
        adim=adim.replace("mertcan","MERTCAN");
        System.out.println(adim);*/
      ///////////////////// diziler ///////////////////////
       /* int[] dizi;
        dizi=new int[20];//söylemen kaç adet diye.
        int[] dizi2=new int[]{1,2,3,4,6,7,12};//kaç adet olduğunu kendisi hesaplar
        int[] dizi3={1,2,34,56};
        System.out.println(dizi2[0]);//birinci elemanı 1 dir.
        System.out.println(dizi2[1]);//ikinci  elemanı
        System.out.println(dizi2[3]);//dörtüncü  elemanı
        dizi2[0]=24;
        System.out.println("öncesi :"+dizi2[4]);//birinci elemanı 45 artık
        dizi2[4]=45;
        System.out.println(dizi2[0]);//birinci elemanı 24 artık
        System.out.println("sonrası :"+dizi2[4]);//birinci elemanı 45 artık
        System.out.println(dizi[0]);

        String[] sinifimiz={"Abdullah","Çağrı","Yasin","Mertcan"};
        for(String ad:sinifimiz)
            System.out.println(ad);
        for(int i:dizi2)
            System.out.println(i);
        //sınıfımızda kaç kişi var?
        System.out.println("sınıfımız :"+sinifimiz.length+" kişiden oluşur.");

        for(String isimler:sinifimiz)
            System.out.println(isimler.toUpperCase());

        String[][]  noktalar=new String[3][4];
        noktalar[0][0]="yahya";
        noktalar[2][3]="selim";
        System.out.println(noktalar[0][0]);
        System.out.println(noktalar[2][3]);
        String[][] pro={
                {"ahmet","mehmet"},//1. satır 2 kolon
                {"veli","ali","atabak"},//2. satır 3 kolon
                {"matematik","fen","yasin","selim"}//3. satır 4 kolon

        };


        System.out.println(pro[0][2]);*/
    }
}
