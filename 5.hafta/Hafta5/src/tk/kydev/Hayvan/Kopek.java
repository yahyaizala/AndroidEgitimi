package tk.kydev.Hayvan;

public class Kopek extends Hayvan {
    @Override
    public void sesCikar() {
        System.out.println("Hav hav da hav hav");
    }

    public void kediYakala()
    {
        System.out.println("Kediyi kovalıyorum her an yakalayabilirim.");
    }
    public  Kopek(String ad, String cins) {
        super(ad,cins);
        this.ad=ad;



    }
}
