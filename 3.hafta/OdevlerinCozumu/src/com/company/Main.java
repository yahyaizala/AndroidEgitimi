package com.company;

import java.util.Scanner;

enum Menu{
    KATILIM,LOGIN,LIST,QUIT
}
public class Main {

    public static void main(String[] args) {

        String[][] kullanicilar={
                {"yahya","kesenek"},
                {"Abdullah","Özerol"},
                {"Mertcan","Bakırcı"},
                {"Çağrı","Bulut"},
                {"ahmet","kobay"}
        } ;




        for(int i=0;i<kullanicilar.length;i++)
        {

            for(String kisi:kullanicilar[i])
            {
                System.out.print(kisi+" ");
            }
            System.out.println("");
        }

        System.out.println("==========================================");

        for(int i=0;i<kullanicilar.length;i++)
        {

            for(int j=0;j<kullanicilar[i].length;j++)
            {
                System.out.print(kullanicilar[i][j]+" ");
            }
            System.out.println("");
        }

        String[] kullanicilar2={
                "yahya kesenek",
                "Abdullah Özerol",
                "Mertcan Bakırcı",
                "Çağrı Bulut",
                "ahmet kobay"
        } ;

        String sifre="abc";
        String kullaniciAdi="ahmet";
        boolean katildi=false;
        boolean login=false;
        Menu mMenu = Menu.LOGIN;
        Scanner input=new Scanner(System.in);
    while (true){
        System.out.println("0-Katılım");
        System.out.println("1-Giriş");
        System.out.println("2-Listele");
        System.out.println("Q-Çıkış");
        String tercih=input.next();
        if(tercih.equals("Q")){//equals eşit mi diye sormaktır?
            mMenu=Menu.QUIT;

        }else{
            int intTercih=Integer.parseInt(tercih);
            mMenu=Menu.values()[intTercih];//girilen sayıyı menüye çeviriyor. Menu.values() enum ı diziye çeviriyor.

        }

        switch (mMenu){
            case LOGIN:
                System.out.println("Kullanıcı adını giriniz :");
                String newKullanci=input.next();
                System.out.println("Kullanıcı şifresini giriniz :");
                String newParola=input.next();
                if (newKullanci.equals(kullaniciAdi) && newParola.equals(sifre))
                {
                    System.out.println("Başarılı bir şekilde giriş yaptınız");
                    System.out.println("Aramıza hoşgeldiniz arkadaşlarımızın listesi :");
                    for(int i=0;i<kullanicilar.length;i++)
                    {

                        for(int j=0;j<kullanicilar[i].length;j++)
                        {
                            System.out.println(kullanicilar[i][j]);
                        }
                    }
                    login=true;

                }
                break;
            case QUIT:
                System.out.println("Güle güle yine bekleriz.");
                System.exit(0);
                break;
            case KATILIM:

                System.out.println("Kullanıcı adını giriniz :");
                String kullanici=input.next();
                System.out.println("Kullanıcı şifresini giriniz :");
                String sifre1=input.next();
                System.out.println("Kullanıcı şifresini tekrar giriniz :");
                String sifre2=input.next();
                System.out.println("Kullanıcı emaili giriniz :");
                String email=input.next();
                if(sifre1.equals(sifre2))
                {
                    katildi=true;
                }



                break;
            case LIST:
                if(katildi || login==true)
                {
                    for(int i=0;i<kullanicilar2.length;i++)
                    {

                        System.out.println(kullanicilar2[i]);
                    }
                }else{
                    System.out.println("Katılım yapmadınız veya login olmadınız. Lütfen giriş yapınız.");
                }
                break;

        }

    }

    }
}
