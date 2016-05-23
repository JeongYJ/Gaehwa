package org.ymdroid.rnb.page;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import org.ymdroid.rnb.R;

/**
 * Created by yj on 16. 5. 22..
 */
public class Mypage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_mypage);
        getSupportActionBar().setTitle("마이페이지");

    }

    public void UserinfoButtonClicked(View v) throws Exception {
        Toast.makeText(getApplicationContext(), "사용자 정보 변경", Toast.LENGTH_LONG).show();
        Intent i = new Intent(Mypage.this, Mypage_Userinfo.class);
        startActivity(i);
    }


    public void ChangePWButtonClicked(View v) throws Exception {
        Toast.makeText(getApplicationContext(), "비밀번호 변경", Toast.LENGTH_LONG).show();
       // Intent i = new Intent(Mypage.this, Mypage_Userinfo.class);
        // startActivity(i);
    }

}