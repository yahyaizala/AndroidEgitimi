package tk.kydev;

import tk.kydev.model.Annotations;
import tk.kydev.model.Map;

public class Main {

    public static void main(String[] args) {

        Map harita=new Map();
        for(int i=0;i<10;i++)
        {
            /*Annotations annon=new Annotations();
            annon.setKonumAdi("İstanbul");*/
            harita.addAnnon(new Annotations());
        }
        Annotations istAnno=new Annotations();
        istAnno.setKonumAdi("İstanbul");
        harita.tiklandi(istAnno);
        harita.zoom(istAnno);
        harita.secimIptal(istAnno);
        harita.update();

    }
}
