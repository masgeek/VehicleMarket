package com.magnus.vehiclemarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] web = {
            "Car 1",
            "Car 2",
            "Car 3",
            "Car 4",
            "Car 5",
            "Car 6",
            "Car 7",
            "Car 8",
            "Car 9",
            "Car 10",
            "Car 11",
            "Car 12",
            "Car 13",
            "Car 14",
            "Car 15",
            "Car 16",
            "Car 17",
            "Car 18",
            "Car 19",
    };

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
        setContentView(R.layout.activity_main);

        VehicleList adapter = new VehicleList(MainActivity.this, web, imageId);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(), VehicleDetailsActivity.class);
                intent.putExtra("imageId", +position);
                intent.putExtra("model", web[+position]);
                startActivity(intent);
            }
        });

    }
}
