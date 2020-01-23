package org.electromob.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aceptance extends AppCompatActivity {

    private Button yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptance);

        yes = (Button)findViewById(R.id.yes);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(aceptance.this,acceptance2.class));
            }
        });

    }
}
