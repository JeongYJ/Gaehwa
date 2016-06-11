package org.ymdroid.rnb.page;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;

import org.ymdroid.rnb.R;

/**
 * Created by yj on 16. 5. 22..
 */
public class Cosmetic_ingredient extends ActionBarActivity {

     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetic_ingredient);

        getSupportActionBar().setTitle("화장품 성분 정보");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0x00000000));
    }
}

