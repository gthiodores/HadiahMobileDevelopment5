package com.example.android.hadiahmobiledevelopment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final double PI = 3.14;

    private EditText mEditTinggi, mEditJari;
    private Button mButtonHitung;
    private TextView mTextHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditJari = findViewById(R.id.EditJari);
        mEditTinggi = findViewById(R.id.EditTinggi);
        mButtonHitung = findViewById(R.id.ButtonHitung);
        mTextHasil = findViewById(R.id.TextHasil);

        mButtonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textTinggi, textJari;

                textJari = mEditJari.getText().toString().trim();
                textTinggi = mEditTinggi.getText().toString().trim();

                if(!textJari.equals("") && !textTinggi.equals("")){
                    double volume = (PI * Double.parseDouble(textJari) * Double.parseDouble(textTinggi))/3;
                    mTextHasil.setText(String.valueOf(volume));
                } else
                    Toast.makeText(MainActivity.this, "Ada field yang masih kosong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
