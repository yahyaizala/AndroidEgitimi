package tk.kydev.Kolleksiyonlar;

import java.util.*;

public class TestEt {

    public static void doHashMap()
    {
        HashMap<String,Integer> dict=new HashMap();
        dict.put("Yahya",37);
        dict.put("Abdullah",26);
        dict.put("Yasin",17);
        dict.put("Mertcan",19);
        dict.put("Çağrı",20);
        Set set=dict.entrySet();
        Iterator iter=set.iterator();
        while (iter.hasNext()){
            Map.Entry entry= (Map.Entry) iter.next();
            System.out.println(entry.getKey()+"---"+entry.getValue());

        }



    }
    public static void doTest()
    {
        ArrayList<String> arr=new ArrayList();
        arr.add("Selam");
        arr.add("Ne haber");
        for(String str:arr){
            System.out.println(str);
        }
        String ikinciEleman=arr.get(1);
        arr.remove(0);
        System.out.println("Dizinin ilk elemanı silindi");
        for(int i=0;i<arr.size();i++){
            String gelenEleman=arr.get(i);
            System.out.println(gelenEleman);

        }



    }
}
