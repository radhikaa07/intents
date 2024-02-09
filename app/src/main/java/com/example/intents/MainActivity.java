package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoACT();
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webPAGE();
            }
        });
    }




   public  void gotoACT(){
       Intent intent = new Intent(this, MainActivity2.class);
       startActivity(intent);
   }

   public void webPAGE(){

        Uri webpage = Uri.parse("https://www.google.com");
        Intent intent= new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
   }





}