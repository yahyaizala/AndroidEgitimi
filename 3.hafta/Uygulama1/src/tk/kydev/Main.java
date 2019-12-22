package tk.kydev;

public class Main {

    static int kareAl(int x){
        return x * x;
    }
    static  int faktoriyel(int x)
    {
        int sonuc=1;
        for(int i=1;i<x;i++)
        {
            sonuc *=i;
        }
        return sonuc;

    }
    static int recursiveFaktoriyel(int x)
    {
        if(x==0) return 1;

        return  x*recursiveFaktoriyel(x-1);//5*4*3*2*1
    }
    static int aralikliTopl(int altSinir,int ustSinir)
    {
        int toplam=0;
        for (int i = altSinir; i < ustSinir; i++){
            toplam += kareAl(i);
        }
        return toplam;

    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(faktoriyel(10));
        System.out.println(faktoriyel(0));
        System.out.println(faktoriyel(1));
        System.out.println("====================================");
        System.out.println(recursiveFaktoriyel(5));
        System.out.println("3 ile 15 arasındaki sayıların toplamı: " + aralikliTopl(4,15));
    }
}
