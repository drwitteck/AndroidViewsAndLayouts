package edu.temple.viewsandlayouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ThirdActivity extends Activity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        linearLayout = (LinearLayout) findViewById(R.id.imageHolder);

        findViewById(R.id.newImageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = new ImageView(ThirdActivity.this);
                image.setImageResource(R.drawable.testimage);
                linearLayout.addView(image);

            }
        });
    }
}
