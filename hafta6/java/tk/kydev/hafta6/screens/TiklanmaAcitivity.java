package tk.kydev.hafta6.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;

import tk.kydev.hafta6.R;

public class TiklanmaAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiklanma_acitivity);

        final Button maviBtn=findViewById(R.id.maiBtn);
        Button kirmiziBtn=findViewById(R.id.kirmiziBtn);
        Button sariBtn=findViewById(R.id.sariBtn);
        maviBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button)v).setBackgroundColor(Color.RED);
            }
        });

    }
}
