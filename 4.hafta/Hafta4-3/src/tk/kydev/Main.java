package tk.kydev;

public class Main {


    static class Araba {
        String model;
        String marka;
        int hiz;

        public int getHiz() {
            return hiz;
        }

        public void setHiz(int hiz) {
            this.hiz = hiz;
        }

        void print() {
            System.out.println("Arabanın özellikleri : \n Model : " + this.model + "\n Marka:" + this.getMarka());
        }
        void sur()
        {
            System.out.println("Araba hareket etti");
            setHiz(10);
        }


        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getMarka() {
            return marka;
        }

        public void setMarka(String marka) {
            this.marka = marka;
        }


    }

    static  void baslangic()
    {
        // write your code here
        Araba toyota = new Araba();
        toyota.setMarka("Toyota");
        toyota.setModel("Yaris");
        toyota.print();
        toyota.setModel("Corolla");
        toyota.print();
        String marka = toyota.getMarka();//marka talebi oluşturduk.
        System.out.println(marka);
        System.out.println("Şimdiki hızım ->"+toyota.getHiz());
        toyota.sur();
        int suankiHiz=toyota.getHiz();//current -> şuanki demek
        System.out.println("Şimdiki hızım ->"+suankiHiz);
        Otomobil otomobil=new Otomobil();
        otomobil.vergiHesapla((short) 1400);
        System.out.println(otomobil.getVergi());
        Daire d = new Daire(5);

        System.out.println(d.alan);
        System.out.println(d.cevre);
        Users[] kullanicilar=new Users[5];
        kullanicilar[0]=new Users("yahya","kesenek","Boş yapma",0);
        kullanicilar[1]=new Users("Mercan","Bakırcı","Mecidiyeköyde olay flash flash ",1);
        kullanicilar[2]=new Users("Abdullah","Özerol","Intellij idea çıldırdı.",2);
        kullanicilar[3]=new Users("Yasin","Demir","Kardeşim yakıyorsun...",3);
        kullanicilar[4]=new Users("Çağrı","Bulut","Havalar soğudu kış kapıda",4);
        for(Users kullanici:kullanicilar)
        {
            if(!kullanici.getAd().equals("Yasin")) continue;
            System.out.println(kullanici.getAd()+"'nın mesajı :"+kullanici.getMesaj());
            /*if(kullanici.getAd().equals("Yasin")) {
                System.out.println(kullanici.getAd()+"'nın mesajı :"+kullanici.getMesaj());

            }*/

        }
    }
    public static void main(String[] args) {









    }
}
