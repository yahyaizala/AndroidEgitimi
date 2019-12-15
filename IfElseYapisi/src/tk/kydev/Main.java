package tk.kydev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int x=10;
        if(x>10)//x 10 ise x>10 x 10 dan büyük mü? if sormaktır doğru mu diye?
        {
            System.out.println("sayı 10 dan eşit hahahah");
        }else if (x<10){//10 dan küçük müsün?
            System.out.println("sayımız 10 dan küçük");//evet 10 dan küçüğüm
        }else{
            System.out.println("sayımız 10 muş");
        }*/
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz ->");
        String metin=input.nextLine();
        int orta= (int) Math.ceil(metin.length()/2);//ortasını bulduk
        String kesilmis=metin.substring(0,orta);//substring ile bölümü aldık. baştan ortaya kadar
        System.out.println("Kesilmiş metin -> "+kesilmis);
        //2. ve 3. harflerini al
        System.out.println("2. harfi "+kesilmis.charAt(1)+" 3. harfi "+kesilmis.charAt(2));
    }
}
