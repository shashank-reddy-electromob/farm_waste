package org.electromob.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView farmer,seg,transportation,business;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         farmer = (ImageView)findViewById(R.id.farmer123);
         seg = (ImageView)findViewById(R.id.segre);
         transportation = (ImageView)findViewById(R.id.transportation);
         business = (ImageView) findViewById(R.id.business123);

         farmer.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this, farmerdecision.class));
             }
         });

         seg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,farmerauthentication1.class));
             }
         });

         transportation.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,farmerauthentication2.class));
             }
         });

         business.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,farmerauthentication3.class));
             }
         });

    }
}
