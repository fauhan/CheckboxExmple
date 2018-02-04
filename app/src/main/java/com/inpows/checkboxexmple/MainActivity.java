package com.inpows.checkboxexmple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkbox1, checkbox2, checkbox3;
    private Button submit;
    private TextView pilihan1, pilihan2, pilihan3;
    private String tempat1, tempat2, tempat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pilihan1 = findViewById(R.id.pilihan_satu);
        pilihan2 = findViewById(R.id.pilihan_dua);
        pilihan3 = findViewById(R.id.pilihan_tiga);
        submit = findViewById(R.id.submit);
        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox1.isChecked()) {
                    tempat1 = (String) checkbox1.getText();
                } else {
                    tempat1 = "Kosong";
                }
                if (checkbox2.isChecked()) {
                    tempat2 = (String) checkbox2.getText();
                } else {
                    tempat2 = "Kosong";
                }
                if (checkbox3.isChecked()) {
                    tempat3 = (String) checkbox3.getText();
                } else {
                    tempat3 = "Kosong";
                }

                pilihan1.setText("Pilihan 1: " + tempat1);
                pilihan2.setText("Pilihan 2: " + tempat2);
                pilihan3.setText("Pilihan 3: " + tempat3);
            }
        });

    }
}
