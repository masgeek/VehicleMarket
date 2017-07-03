package com.magnus.vehiclemarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class VehicleDetailsActivity extends AppCompatActivity {


    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.image12,
            R.drawable.image13,
            R.drawable.image14,
            R.drawable.image15,
            R.drawable.image16,
            R.drawable.image17,
            R.drawable.image18,
            R.drawable.image19,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicle_details);

        ImageView img = (ImageView) findViewById(R.id.MainImageView);
        TextView txtModel = (TextView) findViewById(R.id.txtModel);
        TextView txtPrice = (TextView) findViewById(R.id.lblPrice);

        int image_id = getIntent().getExtras().getInt("imageId");
        String modelName = getIntent().getStringExtra("model");
        int vehiclePrice = (image_id * 456778);;

        img.setImageResource(imageId[image_id]);
        txtModel.setText(modelName);
        //txtPrice.setText(Integer.toString(vehiclePrice));
    }

}
