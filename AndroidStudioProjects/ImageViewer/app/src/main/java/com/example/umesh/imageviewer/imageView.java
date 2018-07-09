package com.example.umesh.imageviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class imageView extends AppCompatActivity {
private static ImageView imgview;
    private static Button buttonSbm;

    private int current_image_index;
    int[] image = {R.mipmap.image,R.mipmap.image1,R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        buttonClick();
    }
    public void buttonClick(){
        imgview = (ImageView)findViewById(R.id.imageView);
        buttonSbm = (Button)findViewById(R.id.button);
        buttonSbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index++;
                        current_image_index = current_image_index % image.length;
                        imgview.setImageResource(image[current_image_index]);
                    }
                }
        );
    }
}
