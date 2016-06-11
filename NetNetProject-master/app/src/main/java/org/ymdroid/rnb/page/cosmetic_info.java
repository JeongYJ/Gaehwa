package org.ymdroid.rnb.page;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import org.ymdroid.rnb.R;

/**
 * Created by yj on 16. 5. 17..
 */
public class Cosmetic_info extends ActionBarActivity {

    ImageView cosImage;
    ImageButton heartButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetic_info);
        cosImage = (ImageView)findViewById(R.id.img_cosmetic);
        heartButton = (ImageButton)findViewById(R.id.heart_button);

        getSupportActionBar().setTitle("화장품 정보");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0x00000000));
    }

    public void CosSampleButtonClicked(View v)throws Exception
    {
        Toast.makeText(getApplicationContext(), "Click",Toast.LENGTH_LONG).show();
    }
}
