package tk.kydev;

import java.util.Random;
import java.util.Scanner;

public class Main {

   static void calculate(int n)
    {
        String[] nums={"0","1","2","3","4","5","6","7","8","9"};
        String[] letters={"A","B","C","D","E"};
        String[] psw=new String[n];
        Random r=new Random();
        int rnd=r.nextInt(nums.length);


        for(int i=0;i<n;i++)
        {
            int rndLetters=r.nextInt(letters.length);
            if(rndLetters>0)
                if(i%rndLetters==0 )
                    letters[rndLetters]=letters[rndLetters].toLowerCase();
            psw[i]=letters[rndLetters];//harf büyük var küçük


        }
        int nRand=r.nextInt(psw.length);
        psw[nRand]=nums[rnd];


        String s="";
        for(String a:psw){
            s+=a;

        }

        System.out.println(s);


    }

    public static void main(String[] args) {
	    // write your code here
        //ORTALAMA VE MOD BULMA
       /* int[] dizi={1,10,10,10,5,6,7,8,8,8,9,10,0};

        double ort, top = 0;

        for (int i = 0; i < dizi.length; i++){
            top += dizi[i];
        }

        ort = top / dizi.length;

        System.out.println("ortalama: " + ort);

        int[] sayac = new int[dizi.length];
        int sayac1 = 0;

        for(int i = 0; i < dizi.length; i++){
            for(int j = 0; j < dizi.length; j++){
                if(dizi[i] == dizi[j]){
                    sayac1++;
                }
                sayac[i] = sayac1;
            }
            sayac1 = 0;
        }


        int enb = sayac[0];
        int mod = 0;

        for(int i = 0; i < (sayac.length -1); i++){
            //System.out.println((i+1) + ".eleman:" + sayac[i]);
            if(sayac[i] < sayac[i+1]){
                enb = sayac[i+1];
                mod = i + 1;
            }
        }

        System.out.println("mod: " + dizi[mod] + " ve " + enb + " defa tekrar etmiştir.");

        //RASGELE SAYI ŞİFRE ÜRETİMİ

        Scanner scanner = new Scanner(System.in);

        boolean buyuk_harf_check = false;
        boolean kucuk_harf_check = false;
        boolean rakam_check = false;

        String buyuk_harf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String kucuk_harf = "abcdefghijklmnopqrstuvwxyz";
        String rakamlar = "0123456789";
        String hepsi = buyuk_harf + kucuk_harf + rakamlar;

        Random rnd = new Random();


        int uzunluk =6;// scanner.nextInt();
        int index = 0;
        char[] password = new char[uzunluk];

        do {
            for (int i = 0; i < uzunluk; i++) {
                password[i] = hepsi.charAt(rnd.nextInt(hepsi.length()));
            }

            for (int i = 0; i < uzunluk; i++) {
                for (int j = 0; j < buyuk_harf.length(); j++) {
                    if (password[i] == buyuk_harf.charAt(j)) {
                        buyuk_harf_check = true;
                        break;
                    }
                }
                if (buyuk_harf_check) break;
            }

            for (int i = 0; i < uzunluk; i++) {
                for (int j = 0; j < kucuk_harf.length(); j++) {
                    if (password[i] == kucuk_harf.charAt(j)) {
                        kucuk_harf_check = true;
                        break;
                    }
                }
                if (kucuk_harf_check) break;
            }

            for (int i = 0; i < uzunluk; i++) {
                for (int j = 0; j < rakamlar.length(); j++) {
                    if (password[i] == rakamlar.charAt(j)) {
                        rakam_check = true;
                        break;
                    }
                }
                if (rakam_check) break;
            }
        } while (!(buyuk_harf_check && kucuk_harf_check && rakam_check));

        System.out.print("tebrikler parolanız başarıyla oluşturuldu: ");
        System.out.println(password);
        //yahya hoca çözümü şifre mantığı

        calculate(10);*/

       //SWITTER UYGULAMASI
        String[][] tweet=new String[][]{
                {
                    "Yahya Kesenek","Merhaba arkadaşlar. Gününüz nasıl geçiyor."
                },
                {
                        "Abdullah özerol","Yeni otomobilimiz hayırlı olsun. İçi italyan dışı türk"
                },
                {
                        "Yasin demir","C++ ile yaptığım oyunu indiriniz."
                },
                {
                "Çağrı bulut","Havalar kötü, iyi giyinin."
                }, {
                "Mertcan bakırcı","Selam gençler nasılsınız? Almanya'dayım şuan. Android geliştiricileri burada mı?"
        },
        };
        print(tweet,null);
        String[] yorumlar=yorumAl();
        print(tweet,yorumlar);





    }

    static  String[] yorumAl()
    {

        Scanner input=new Scanner(System.in);
        System.out.println("Yorum yapmak istediğiniz tweet numarasını giriniz.");
        int tweetId=input.nextInt();
        input.nextLine();
        System.out.println("Adınızı giriniz:");
        String commentedName=input.nextLine();
        System.out.println("Yorumunuzu giriniz :");
        String comment=input.nextLine();
        String[] commentList=new String[]{
            ""+tweetId,commentedName,comment
        };
        return commentList;
    }
    static  void print(String[][] tweets,String[] yorum){
       int tweetId=1;
        String yorumId="";
        String yorumYapan="";
        String yorumunKendisi="";

       if(yorum!=null)
       {
            yorumId=yorum[0];
            yorumYapan=yorum[1];
            yorumunKendisi=yorum[2];

       }
        int yorumVar=0;
       if (!yorumId.isEmpty())
        yorumVar=Integer.parseInt(yorumId);

        for(String[] twit:tweets){
                String kullaniciAdi=twit[0];
                String mesaji=twit[1];
            System.out.println(tweetId+":"+kullaniciAdi+"--"+mesaji);
                if(tweetId==yorumVar)
                {
                    System.out.println("\t"+yorumYapan+"--"+yorumunKendisi);
                }

            tweetId++;
        }
    }
}
