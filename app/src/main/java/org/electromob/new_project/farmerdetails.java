package org.electromob.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class farmerdetails extends AppCompatActivity {

    private ImageView clickedImage;
    private static final int pic_id = 123;
    Bitmap photo;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmerdetails);

        clickedImage = (ImageView)findViewById(R.id.picture);
        next = (Button)findViewById(R.id.next5);

        clickedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(camera_intent, pic_id);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(farmerdetails.this,farmer.class));
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == pic_id) {

            photo = (Bitmap) data.getExtras().get("data");
            clickedImage.setImageBitmap(photo);
        }
    }

    public void submitData(View v){
        if(photo==null){
            Toast.makeText(this,"Click Image of Parking Spot",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Successfully Submitted Data",Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
