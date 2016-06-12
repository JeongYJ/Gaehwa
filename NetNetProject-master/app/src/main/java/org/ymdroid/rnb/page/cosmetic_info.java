package org.ymdroid.rnb.page;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.ymdroid.rnb.R;
import org.ymdroid.rnb.key.CosInfo;
import org.ymdroid.rnb.key.Key;

/**
 * Created by yj on 16. 5. 17..
 */
public class Cosmetic_info extends ActionBarActivity {

    public ImageView cosimg;
    public TextView cosName;
    public TextView cosBrand;
    public TextView cosType;
    public TextView cosPrice;
    public TextView cosHighPrice;
    Resources res;


    ImageButton heartButton;
    CosInfo cosInfo = Key.cosInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetic_info);
        cosimg = (ImageView)findViewById(R.id.img_cosmetic);
        cosName = (TextView) findViewById(R.id.tv_cosname);
        cosBrand = (TextView) findViewById(R.id.tv_brand);
        cosType= (TextView) findViewById(R.id.tv_type);
        cosPrice = (TextView) findViewById(R.id.tv_cost);
        res = getResources();
       // cosHighPrice = (TextView) findViewById(R.id.tv_cosname);
        getSupportActionBar().setTitle("화장품 정보");
        setCosmeticInfo();
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0x00000000));
    }

    public void setCosmeticInfo(){
        cosimg.setImageBitmap(BitmapFactory.decodeResource(res, cosInfo.img));
        cosName.setText(cosInfo.name);
        cosBrand.setText(cosInfo.brand);
        cosType.setText(cosInfo.type);
        cosPrice.setText(String.valueOf(cosInfo.lowPrice + " ~ " + cosInfo.highPrice));
    }

    public void CosSampleButtonClicked(View v)throws Exception
    {
        Toast.makeText(getApplicationContext(), "Click",Toast.LENGTH_LONG).show();
    }

    public void reviewPageOnClicked(View v)throws Exception
    {
        Intent i = new Intent(Cosmetic_info.this, Review_page.class);
        startActivity(i);
        finish();
        Toast.makeText(getApplicationContext(), "Review",Toast.LENGTH_LONG).show();
    }

}
