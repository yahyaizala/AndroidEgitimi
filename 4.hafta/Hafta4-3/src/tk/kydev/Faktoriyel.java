package tk.kydev;

public class Faktoriyel {
    int sonuc=1;
    public void bul(int hedef)
    {
        sonuc=factor(hedef);
    }
    private int factor(int x)
    {
        if(x==0) return 1;
        return x*factor(x-1);
    }
}
