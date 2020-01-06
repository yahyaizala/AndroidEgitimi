package tk.kydev.Hayvan;

public class Hayvan {

    public void sesCikar(){
        System.out.println("Öter");
    }
  protected    String ad;
  protected String cins;
    public Hayvan(String ad,String cins)
    {
            this.ad=ad;
            this.cins=cins;
        System.out.println("Hayvan içindeki konstrutor");
    }
}
