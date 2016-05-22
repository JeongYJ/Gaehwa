package org.ymdroid.rnb.page;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import org.ymdroid.rnb.R;

/**
 * Created by yj on 16. 5. 22..
 */
public class Mypage extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_mypage);
    }

    public void UserinfoButtonClicked(View v) throws Exception {
        Toast.makeText(getApplicationContext(), "사용자 정보 변경", Toast.LENGTH_LONG).show();
        Intent i = new Intent(Mypage.this, Mypage_Userinfo.class);
        startActivity(i);
    }

}