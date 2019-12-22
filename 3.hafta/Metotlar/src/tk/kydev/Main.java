package tk.kydev;

public class Main {

    static void topla()
    {
        int x=10;
        int y=20;
        System.out.println(x+" ile "+y+" toplamı ="+(x+y));
    }
   static int topla(int x,int y)
    {
        return x+y;
    }
    static double topla(double x,double y)
    {
        return x+y;
    }
    static  boolean tekMiCiftMi(int x)
    {
        if (x%2==0)
            return  true;
        else
            return false;
    }
    static String[] kisiVer()
    {
        return  new String[]{"Yahya","Kesenek"};
    }
    static  String asalSayiMi(int x)
    {
        //10
        // 2,3,4 ... 9
        boolean sonuc=true;
        if(x==1) return x+" Asal sayı değildir.";
        for(int i=2;i<x;i++)
        {
            if(x%i==0){
                sonuc=false;
                break;
            }

        }
        if(sonuc)
        {
            return x+" Asal Sayıdır";
        }else{
            return x+" Asal sayı değildir.";
        }
    }
    public static void main(String[] args) {
	// write your code here
        topla();
        int toplam=topla(5,6);//bir fonksiyonu farklı şekilde kullanmaya overloading denir.
        System.out.println(toplam);
        double toplam2=topla(4.5,6.7);
        System.out.println(toplam2);
        P(tekMiCiftMi(12));
        P(tekMiCiftMi(13));
        P(asalSayiMi(1));
        P(asalSayiMi(2));
        P(asalSayiMi(102));
        P(asalSayiMi(101));
        P(asalSayiMi(11));

        String[] adSoyad=kisiVer();
        P(adSoyad[0]);//ad
        P(adSoyad[1]);//soyad

    }
    static  void P(Object obje)
    {
        System.out.println(obje);
    }
}
