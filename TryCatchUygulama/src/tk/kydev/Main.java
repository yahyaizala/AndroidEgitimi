package tk.kydev;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String metin=null;
        try{
            if(metin==null)
                throw  new NullPointerException("Metin boş olamaz");
        }catch (Exception e){//(NullPointerException e){//Exception veya yukarıdaki hata türü ile aynı olmalı yakalanan hata
            System.out.println(e.getLocalizedMessage());
        }


        try{
            int a=85;
            int b=0;
            //b sıfır ise sıfıra bölme hatası kesindir ve ben bunu biliyorum.
            //kendim hata mesajı ile kullanıcıya bildiriyorum.

            int c=a/b;
            //throw  new IllegalArgumentException("Benim sana verdiğim hatayı al ve yaz");
            //kendim hata oluşturdum ve hata mesajını da ben yazdım
        }catch(Exception e){//bütün hataları yakalar
            System.out.println("Hata oluştu "+e.getLocalizedMessage());
        }
    }
}
