package tk.kydev;


import tk.kydev.AndroidDemo.Button;
import tk.kydev.AndroidDemo.ClickHandler;
import tk.kydev.Jenerik.Test;
import tk.kydev.Kolleksiyonlar.TestEt;

import java.util.HashMap;


public class Main implements ClickHandler {


    void ilkCalisan()
    {
        Insan insan=new Insan();
        insan.dalisYap();
        insan.hizliYuru();
        insan.suzul();

    }
    void UygulamaCozumu()
    {
        // write your code here
        Button btn=new Button();
        btn.onClick(new Main());
    }

    static <T extends Number> T ekle(T x, T y)
    {

        Double sum=new Double(0);
        sum=x.doubleValue()+y.doubleValue();
        return (T) sum;
    }


    static <T> void print(T[] array)
    {
        for(T k:array)
        {
            System.out.println(k);
        }
    }
    public static void main(String[] args) {


        int[] dizi={3,4,5,6,9,6,3,3,9,9,9,9,5};
        //3->3
        //4->1
        //5->2 anahtar ve değer oluyor
        HashMap<Integer,Integer> sayiVeAdedi=new HashMap<>();//<sayı,adedi>
        for(int d:dizi)
        {
            if(sayiVeAdedi.containsKey(d)){
                int adet=sayiVeAdedi.get(d);
                adet++;


            }else {
                sayiVeAdedi.put(d,1);
            }
        }


        // TestEt.doHashMap();
       // TestEt.doTest();






         /* Test<Integer,String > test=new Test(2,"hello");
        test.print();


        System.out.println(ekle(new Integer(2),new Integer(5)));
        System.out.println(ekle(1,4.5));
        System.out.println(ekle(new Double(2.6),new Integer(2)));
        Integer[] dizi1={1,2,4,5,6,8,9};
        print(dizi1);
        String[] dizi2={"yahya","Çağrı","Abdullah","Yasin","Mertcan"};
        print(dizi2);*/





    }

    @Override
    public void onClickHandler()
    {
        System.out.println("Clicklendim bea");
    }
}
