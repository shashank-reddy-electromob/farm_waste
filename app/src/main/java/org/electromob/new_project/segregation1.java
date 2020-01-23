package org.electromob.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segregation1 extends AppCompatActivity {

    private Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segregation1);

        bt1 = (Button)findViewById(R.id.bt11);
        bt2 = (Button)findViewById(R.id.bt21);
        bt3 = (Button)findViewById(R.id.bt31);
        bt4 = (Button)findViewById(R.id.bt41);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(segregation1.this,acceptance1.class));
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(segregation1.this,acceptance1.class));
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(segregation1.this,acceptance1.class));
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(segregation1.this,acceptance1.class));
            }
        });

    }
}
