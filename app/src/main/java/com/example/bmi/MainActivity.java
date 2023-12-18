package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView weight,feet,inches,result;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=(TextView) findViewById(R.id.weight);
        feet=(TextView) findViewById(R.id.ft);
        inches=(TextView) findViewById(R.id.in);
        result=(TextView) findViewById(R.id.bmi);

        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt=Integer.parseInt(weight.getText().toString());
                int ft=Integer.parseInt(feet.getText().toString());
                int in=Integer.parseInt(inches.getText().toString());

                int totalin=ft*12+in;
                double totalcm=totalin*2.53;
                double totalmt=totalcm/100;
                double bmi=wt/(totalmt*totalmt);
                String data= String.valueOf(bmi);



                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("data",data);
                startActivity(intent);

            }
        });




    }
}