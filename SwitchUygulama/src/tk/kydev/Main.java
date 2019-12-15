package tk.kydev;

enum KullanciTipi{
    ADMIN,SUPERUSER,NORMALUSER
}
public class Main {

    public static void main(String[] args) {
	    // write your code here
        String[] dizi={"ahmet","mehmet","veli","ayşe"};
        //dizinin boyutunu nasıl alıyordur dizi.length
        int a=0;
        while (a<dizi.length)//a sayısı dizinin boyutundan küçük ise çalış yoksa dur
        {
            System.out.println(dizi[a]);
            a++;
        }



        for(int i=0;i<4;i++)
        {
            dizi[i]=dizi[i].toUpperCase();
        }

        for(int k=20;k<=50;k+=2)
            System.out.println(k);





        System.exit(0);//altındakiler çalışmaz
        KullanciTipi kullanici=KullanciTipi.NORMALUSER;
        switch (kullanici){
            case ADMIN:
                System.out.println("Sen adminsin herşey senin");
                break;
            case SUPERUSER:
                System.out.println("Superuser iyidir");
                break;
            default:
                System.out.println("Normal kullanıcısın");
                break;


        }

    }
}
