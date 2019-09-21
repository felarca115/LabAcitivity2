package com.felarca.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etSchool1, etSchool2, etSchool3, etSchool4, etSchool5, etSchool6, etSchool7, etSchool8;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSchool1 = findViewById(R.id.etSchool1);
        etSchool2 = findViewById(R.id.etSchool2);
        etSchool3 = findViewById(R.id.etSchool3);
        etSchool4 = findViewById(R.id.etSchool4);
        etSchool5 = findViewById(R.id.etSchool5);
        etSchool6 = findViewById(R.id.etSchool6);
        etSchool7 = findViewById(R.id.etSchool7);
        etSchool8 = findViewById(R.id.etSchool8);
    }

    public void save(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String univ1 = etSchool1.getText().toString();
        String univ2 = etSchool2.getText().toString();
        String univ3 = etSchool3.getText().toString();
        String univ4 = etSchool4.getText().toString();
        String univ5 = etSchool5.getText().toString();
        String univ6 = etSchool6.getText().toString();
        String univ7 = etSchool7.getText().toString();
        String univ8 = etSchool8.getText().toString();

        editor.putString("UST", univ1);
        editor.putString("Admu", univ2);
        editor.putString("NU", univ3);
        editor.putString("UE", univ4);
        editor.putString("UP", univ5);
        editor.putString("ADAMSON", univ6);
        editor.putString("DLSU", univ7);
        editor.putString("FEU", univ8);
        editor.commit();
        Toast.makeText(this, "Contents saved", Toast.LENGTH_LONG).show();
    }

    public void next(View v){
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }
}
