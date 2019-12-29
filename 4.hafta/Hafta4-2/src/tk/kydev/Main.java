package tk.kydev;

import tk.kydev.data.Araba;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Araba bmv=new Araba();//arabayı nesne haline getirdim.
        Araba toyota=new Araba("kırmızı","Toyota","Yaris");
        Araba mecedes=new Araba(2019,"Mercedes");
        mecedes.setModel("E200");
        toyota.setModel("Corolla");
        System.out.println("Marka :"+mecedes.getMarka()+" model:"+mecedes.getModel());
        System.out.println("Marka :"+toyota.getMarka()+" model:"+toyota.getModel());


    }
}
