package tk.kydev;

public class Otomobil {
    private String marka;
    private short silindirHacmi;
    private int vergi;

    void vergiHesapla(short silindirHacmi) {
        this.silindirHacmi = silindirHacmi;
        int vergi = 0;
        if (silindirHacmi < 1300) vergi = 450;
        else if (silindirHacmi < 1600) vergi = 600;
        else if (silindirHacmi < 2000) vergi = 800;
        else vergi = 1200;
        this.vergi = vergi;
    }

    public int getVergi() {
        return vergi;
    }


}
