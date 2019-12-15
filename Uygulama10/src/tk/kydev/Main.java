package tk.kydev;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // dizinin elemanını alacak (1 tanesini aldık)
        // bu elemanı karşılaştıracaz diğer elemanlarla
        //bu eleman diğerlerinden daha uzunsa aranan budur.
        //değilse ikincisi için yukarıdaki işlemleri tekrarlayacağız.

        String[] isimler= {"ekrem","tayfun","muhammet","merve"};
        String enb = isimler[0];

        for (String b: isimler){
            if (enb.length() < b.length()){
                enb = b;
            }
        }
        System.out.println("en uzun isim:" + enb);
    }
}
