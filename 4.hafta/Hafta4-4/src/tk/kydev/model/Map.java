package tk.kydev.model;

public class Map {


    public Map(){
        System.out.println("Map ekrana eklendi.");
    }
    public void update()
    {
        System.out.println("Haritaki konumlar güncellendi");
    }
    public void addAnnon(Annotations anno)
    {
        System.out.println("Annotation eklendi.");

    }
    public void removeAnno(Annotations anno)
    {
        System.out.println("Annotation kaldırıldı.");
    }
    public void tiklandi(Annotations anno)
    {
        System.out.println(anno.getKonumAdi()+" annotationsı tıklandı.");
    }
    public void secimIptal(Annotations anno)
    {
        System.out.println("Haritadaki annotation seçimi iptal edildi.");
    }
    public void zoom(Annotations anno)
    {
        System.out.println("Zoomlandı.");
    }

}
