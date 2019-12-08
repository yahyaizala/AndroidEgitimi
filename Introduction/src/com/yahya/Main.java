package com.yahya;

import java.sql.SQLOutput;

public class Main {

    //başlangıç fonksiyonu
    public static void main(String[] args) {

        //bölme işlem 2/5
        //toplama 4+5
        //çıkarma 4-5
        //çarpma da 4*5

        /*
        destanım şu şekil
        dfdkjfd
        fdjdfd


         */
        //System.out.print("")
       /* System.out.print("Yahya");
        System.out.print("kesenek");
        System.out.print("36 yaş");
        System.out.println( "Merhaba java");
        System.out.println("Mehaba 2");
        byte _sayi10=10;
        byte benimSayim=12;//kamıl kase: ilk kelime küçük harfle başlar ikincisi büyük harfle başlar.
        byte benim_sayim=123;
        int _sayi13=12;
        long sayi=34567;
        double doubleSayi=12.3;
        System.out.println(_sayi10);
        System.out.println(benimSayim);
        System.out.println(benim_sayim);
        System.out.println(_sayi13);
        System.out.println(sayi);
        System.out.println(doubleSayi);

       int sayi;
       sayi=25; //stack sayı=25
        String adim="yahya"; //stack adim bişey var. heap o adimin adı yahyadır.
       double sayi2=123; //değer tipleri ---stack denilen hafıza biriminde tutuluyor. stack-heap
       String adimSoyadim="Yahya kesenek";
        System.out.println(sayi);
        System.out.println(adimSoyadim);
        System.out.println("byte max değeri ="+Byte.MAX_VALUE);
        System.out.println("byte min değeri ="+Byte.MIN_VALUE);
        System.out.println("Integer max değeri ="+Integer.MAX_VALUE);
        System.out.println("Integer min değeri ="+Integer.MIN_VALUE);
        System.out.println("Long max değeri ="+Long.MAX_VALUE);
        System.out.println("Long min değeri"+Long.MIN_VALUE);
        System.out.println("Double max değeri ="+Double.MAX_VALUE);
        System.out.println("Double min değeri ="+Double.MIN_VALUE);
        System.out.println("Float max değeri ="+Float.MAX_VALUE);
        System.out.println("Float min değeri ="+Float.MIN_VALUE);
       double sayi=45;
       Object obj=sayi;//boxing-double objenin içine kutuladık.
        double _sayi=(double)obj;
        int kutahya=43;
        obj=kutahya;//boxing - Değer tipini referans tipine dönüştürdük.
        int _sayi2=(int)obj;//unboxing
        System.out.println(obj);
        System.out.println(_sayi2);
        Integer _integer=new Integer(123);
        System.out.println(_integer.doubleValue());

       int sayi=123;
       double sayiDouble=(double)sayi;
      System.out.println(sayiDouble);
      float floatSayi=23.63f;
      int intSayiOldu=(int)floatSayi;
      System.out.println(intSayiOldu); /


    String sayi="16";
    int _sayi=Integer.parseInt(sayi);
    System.out.println(_sayi);
    String doubleSayi="12.67";
    double dao=Double.parseDouble(doubleSayi);
        System.out.println(dao);
        int sayi1 = 23, sayi2 = 24;
        int toplam = sayi1 + sayi2;
        int carp = sayi1 * sayi2;
        double bol = sayi1 / (double)sayi2;
        int cik = sayi1 - sayi2;
        System.out.println(sayi1+" ile "+sayi2+" nin toplamı :"+toplam);
        System.out.println(sayi1+" ile "+sayi2+" nin çarpımı :"+carp);
        System.out.println(sayi1+" ile "+sayi2+" nin bölümü :"+bol);
        System.out.println(sayi1+" ile "+sayi2+" nin farkı :"+cik);
       int maliyet=2000;
       float kdv=0.18f;
       float satis=maliyet*kdv+maliyet;
        System.out.println(maliyet+" nin %18 kdvli fiyatı :"+satis);
        String adSoyad="Yahya"+" "+"Kesenek";*/
       int a=5;
       int b=3;
       int c=2;
        System.out.println(a%b);// 5 modül 3 =
        System.out.println(a>b);  // 5>3
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println((a>4 && b<3) || c>5); // 5>4 3<3  (ikisi doğru olmalı &&) false
        System.out.println(a>4 || b<3 || c>5); //bitanesi doğru olmalı 5>4 veya 3<3 true
        System.out.println((a>4 & b<3)| c>5);// 5>4 & 3<3
        System.out.println(a>4 | b<3 | c>5); //



    }
}
