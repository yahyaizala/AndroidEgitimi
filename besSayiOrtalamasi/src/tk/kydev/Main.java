package tk.kydev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //uygulama 8 in çözümü
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;

        while (sayac < 5){
            System.out.print("bir sayı giriniz:");
            int a = scanner.nextInt();
            toplam += a;
            sayac++;
        }

        System.out.println("sayıların ortalaması: " + ((double)toplam/sayac));

    }
}
