package tk.kydev.hafta6.abstaractmetods;

public abstract class Araba {
   public String marka;
   int yakitMiktari;
   public abstract void yakitMiktariSaatte(int silindirHacmi);
   public void print()
   {

      System.out.println(this.marka);
   }
}
