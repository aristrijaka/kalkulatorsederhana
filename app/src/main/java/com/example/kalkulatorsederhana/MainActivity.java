package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1,text2;
    Button btn;
    TextView texthasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetupView();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowMessage("adasdasd");
            }
        });


    }
    private void SetupView(){
        text1 = findViewById(R.id.val1);
        text2 = findViewById(R.id.val2);
        btn = findViewById(R.id.btsubmit);
        texthasil = findViewById(R.id.txthasil);
    }
    private void ShowMessage(String message){
        Toast.makeText(getApplicationContext(), message ,Toast.LENGTH_SHORT).show();
    }
}