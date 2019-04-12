package com.ishanbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etHeight, etWeight;
    Button btnCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCalc) {
            float a=Float.parseFloat(etHeight.getText().toString());
            float b=Float.parseFloat(etWeight.getText().toString());
            float BMI = (b*10000/(a*a));
            if(BMI<=18.5) {
                Toast.makeText(MainActivity.this, "The BMI is: " + Float.toString(BMI)+"and you are UnderWight", Toast.LENGTH_LONG).show();
            }
            if(BMI>=18.6 & 24.9>=BMI) {
                Toast.makeText(MainActivity.this, "The BMI is: " + Float.toString(BMI)+"and you are NormalWeight ", Toast.LENGTH_LONG).show();
            }
            if(BMI<=29.9 & BMI>=25) {
                Toast.makeText(MainActivity.this, "The BMI is: " + Float.toString(BMI)+"and you are OverWeight", Toast.LENGTH_LONG).show();
            }
            if(BMI>=30) {
                Toast.makeText(MainActivity.this, "The BMI is: " + Float.toString(BMI)+"and have Obesity", Toast.LENGTH_LONG).show();
            }

            }
    }
}
