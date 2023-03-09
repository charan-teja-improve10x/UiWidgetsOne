package com.improve10x.uiwidgetsone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FizzBuzzActicity extends AppCompatActivity {
    Button submitBtn;
    TextView resultTxt;
    EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz_buzz_acticity);
        handleInitView();
        handleSubmitBtn();
    }
   public void handleInitView() {
       submitBtn = findViewById(R.id.submit_btn);
       numberTxt = findViewById(R.id.number_txt);
       resultTxt = findViewById(R.id.result_txt);
   }


    public void handleSubmitBtn() {
        submitBtn.setOnClickListener(v -> {
        int number = 1000;
        int i = 1;
        while (i <= number) {
            if (i % 5 == 0 && i % 3 == 0) {
                Toast.makeText(this, "FizzBuzz", Toast.LENGTH_SHORT).show();
            } else if (i % 5 == 0) {
                Toast.makeText(this, "Buzz", Toast.LENGTH_SHORT).show();
            } else if (i % 3 == 0) {
                Toast.makeText(this, "Fizz", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, number, Toast.LENGTH_SHORT).show();
            }
        }

        });
    }
}