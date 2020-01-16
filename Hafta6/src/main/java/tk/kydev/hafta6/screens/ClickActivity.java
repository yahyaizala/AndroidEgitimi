package tk.kydev.hafta6.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import tk.kydev.hafta6.R;

public class ClickActivity extends AppCompatActivity {


    boolean btn1Basildi=false;
    void monClick(View button)
    {

        switch (button.getId())
        {
            case R.id.btn1:
                btn1Basildi = !btn1Basildi;
                if (btn1Basildi)
                    ((Button) button).setText("Basma bir daha");
                else
                    ((Button) button).setText("Button 1");

                Toast.makeText(this, "btn1 basıldı", Toast.LENGTH_SHORT).show();
                //button için ne yapılacak
                break;
            case R.id.btn2:
                Toast.makeText(this, "btn2 basıldı", Toast.LENGTH_SHORT).show();
                //button 2 için ne yapılacaksa buraya
                break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        Button bnt1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);

        List<Button> btns=new ArrayList<>();
        btns.add(bnt1);
        btns.add(btn2);

        for(Button b:btns)
        {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    monClick(v);
                }
            });
        }




    }
}
