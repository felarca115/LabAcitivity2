package com.felarca.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText schoolVerify;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        schoolVerify = findViewById(R.id.schoolVerify);

    }

    public void verify(View v){

        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String univsp1 = sp.getString("UST", null);
        String univsp2 = sp.getString("ADMU", null);
        String univsp3 = sp.getString("NU", null);
        String univsp4 = sp.getString("EU", null);
        String univsp5 = sp.getString("UP", null);
        String univsp6 = sp.getString("ADAMSON", null);
        String univsp7 = sp.getString("DLSU", null);
        String univsp8 = sp.getString("FEU", null);
        String schoolvr = schoolVerify.getText().toString();

        if(schoolvr.equals(univsp1) || schoolvr.equals(univsp2) || schoolvr.equals(univsp3) ||
                schoolvr.equals(univsp4) || schoolvr.equals(univsp5) || schoolvr.equals(univsp6) ||
                schoolvr.equals(univsp7) || schoolvr.equals(univsp8)){

            Toast.makeText(this, "This school is competing in UAAP", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "This school is not part of UAAP", Toast.LENGTH_LONG).show();
        }
    }
}
