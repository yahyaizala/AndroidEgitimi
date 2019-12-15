package tk.kydev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String ad = "yahya";
        String sifre = "123abc";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("kullanıcı adı gir ulan");
            String adinput = sc.next();
            System.out.println("parola gir ulan");
            String sifreinput = sc.next();

            if (adinput.equals(ad) && sifreinput.equals(sifre))
            {
                System.out.println("başarılı");
                break;
            }
            System.out.println("tekrar gir ulan");
        }

    }
}
