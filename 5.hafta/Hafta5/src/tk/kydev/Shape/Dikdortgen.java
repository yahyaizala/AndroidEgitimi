package tk.kydev.Shape;

public class Dikdortgen {
    private int uzunKenar;
    private int kisaKenar;
    public Dikdortgen(int kisaKenar,int uzunKenar)
    {
        this.kisaKenar=kisaKenar;
        this.uzunKenar=uzunKenar;


    }

    public int cevreHesapla(){
            return 2*(kisaKenar+uzunKenar);
    }
    public int alanHesapla(){
        return kisaKenar*uzunKenar;

    }
}
