package tk.kydev.data;

public class Araba {
    int tekelekSayi;
    int vitesSayisi;
    int kapiSayisi;
    String renk;
    String marka;
    String model;
    int modelYili;

    public void setMarka(String marka)
    {
        this.marka=marka;
    }
    public String getMarka()
    {
        return this.marka;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public String getModel()
    {
        return  this.model;
    }

    public Araba(){
        System.out.println("Boş araba oluştuldu.");
    }
    public Araba(String _renk,String _marka,String _model)
    {
        renk=_renk;
        marka=_marka;
        model=_model;
        System.out.println("Arabanız oluşturuldu :"+marka+" "+model+" "+renk);

    }
    public Araba(int modelYili,String marka)
    {
        this.modelYili=modelYili;
        this.marka=marka;
        System.out.println("Model ve marka oluşturuldu.");

    }



}
