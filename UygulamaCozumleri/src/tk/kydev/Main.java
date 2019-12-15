package tk.kydev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int rasgeleSayi= (int) (Math.random()*10);
        int hata=0;//0 1 2
        Scanner input=new Scanner(System.in);
        System.out.println(rasgeleSayi);
        System.out.println("Lütfen bir sayı giriniz :>");
        while (true){//sonsuz döngü

            int girilenSayi=input.nextInt();
            if(girilenSayi==rasgeleSayi){
                System.out.println("Kazandınız tebrikler");
                break;
            }
            hata++;
            System.out.println("Bilemediniz kalan hakkınız :"+(3-hata));
            if(hata>2){
                System.out.println("Oyunu kazanamadınız");
                break;
            }
            System.out.println("yeni bir sayı giriniz :>");


        }
    }
}
