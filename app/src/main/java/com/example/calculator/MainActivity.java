package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first;
    EditText ed3;
    EditText second;
    Button submit;
    Button submit1;
    Button submit2;
    Button submit3;
    Float num1, num2, result, result1, result2, result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.first1);
        second = findViewById(R.id.second1);
        submit = findViewById(R.id.btnadd);
        submit1 = findViewById(R.id.btnsub);
        ed3=findViewById(R.id.ed3);
        submit2 = findViewById(R.id.btnmul);
        submit3 = findViewById(R.id.btndiv);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Float.parseFloat(first.getText().toString());
                num2 = Float.parseFloat(second.getText().toString());
                result = num1 + num2;

            //    Toast.makeText(MainActivity.this, "result" + result, Toast.LENGTH_SHORT).show();
                ed3.setText(String.valueOf(result).toString());
            }
        });


        submit1.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){

        num1 =  Float.parseFloat(first.getText().toString());
        num2 =  Float.parseFloat(second.getText().toString());
            result1 = num1 - num2;

            ed3.setText(String.valueOf(result1).toString());
     //   Toast.makeText(MainActivity.this, "result1" + result1, Toast.LENGTH_SHORT).show();

    }
    });

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 =  Float.parseFloat(first.getText().toString());
                num2 =  Float.parseFloat(second.getText().toString());
                result2 = num1 * num2;
                ed3.setText(String.valueOf(result2).toString());
              //  Toast.makeText(MainActivity.this, "result2" + result2, Toast.LENGTH_SHORT).show();

            }
        });
        submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 =  Float.parseFloat(first.getText().toString());
                num2 =  Float.parseFloat(second.getText().toString());
                result3 = num1 / num2;
                ed3.setText(String.valueOf(result3).toString());
              //  Toast.makeText(MainActivity.this, "result3" + result3, Toast.LENGTH_SHORT).show();
                 // mediaPlayer=mediaPlayer.create


            }
        });
    }
    }