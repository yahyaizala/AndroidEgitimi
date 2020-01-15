package tk.kydev.hafta6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import tk.kydev.hafta6.abstaractmetods.Araba;
import tk.kydev.hafta6.abstaractmetods.Mercedes;
import tk.kydev.hafta6.abstaractmetods.Toyota;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Araba mercedes=new Mercedes();
        mercedes.marka="mercedes";
        mercedes.print();
        mercedes.yakitMiktariSaatte(123);

        Araba toyota=new Toyota();
        toyota.marka="Toyota";
        toyota.yakitMiktariSaatte(12);
        toyota.print();


        int[] dizi=new int[]{3,40,1,4,5,6,3,2,3,1,40,9};
        // (3,1) (40,2)
        HashMap<Integer,Integer> mods=new HashMap<>();
        for(int k:dizi)
        {
            if(!mods.containsKey(k))
            {
                mods.put(k,1);
            }else{
                int value=(int)mods.get(k);
                value++;
                mods.put(k,value);

            }

        }
        int max=0;
        int adet=0;

        Set set=mods.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext())
        {

            Map.Entry map= (Map.Entry) iterator.next();
            int value= (int) map.getValue();
            if(value>adet)
            {
                adet=value;
                max= (int) map.getKey();
            }

        }
        System.out.println("===> dizinin modu "+max+" adet "+adet+" var.");
        Log.i("KYDEV","===> dizinin modu "+max+" adet "+adet+" var.");








    }
}
