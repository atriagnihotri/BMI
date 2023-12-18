package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
ImageView imageView;
TextView result,note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=(ImageView) findViewById(R.id.dataimg);
        result=(TextView) findViewById(R.id.result);
        note=(TextView) findViewById(R.id.notedata);
        Intent intent=getIntent();

          result.setText(intent.getStringExtra("data").substring(0,2));
           int data=Integer.parseInt(result.getText().toString());
           if (data>25){
               note.setText("You are Over Weight !! \n Eat Healthy Food Avoid Junk Food Stay Healthy");
               imageView.setImageResource(R.drawable.fat);
           }
        else if (data<18){
            note.setText("You are under weight !! \n Eat Healthy Food ");
            imageView.setImageResource(R.drawable.unfit);
        }
           else {
               note.setText("You are Fit!!");
               imageView.setImageResource(R.drawable.fit);
           }

    }
}