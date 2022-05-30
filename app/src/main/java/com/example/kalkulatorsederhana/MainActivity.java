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
        setupListener();




    }
    private boolean validate(){

        if (text1.getText().toString().equals("") || text1.getText() == null){
            return false;
        }else if (text2.getText().toString().equals("") || text2.getText() == null) {
            return false;
        }
        return true;
    }

    private String value(int value1, int value2){
        int value = value1 + value2;
        return String.valueOf(value);
    }
    private void setupListener(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (validate()) {
                    int value1 = Integer.parseInt(text1.getText().toString());
                    int value2 = Integer.parseInt(text2.getText().toString());

                    texthasil.setText(
                            value(value1, value2)
                    );
                }else ShowMessage("Masukkan Data dengan Benar");
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