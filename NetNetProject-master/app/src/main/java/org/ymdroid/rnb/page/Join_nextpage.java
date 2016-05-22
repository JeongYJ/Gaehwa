package org.ymdroid.rnb.page;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import org.ymdroid.rnb.R;
import org.ymdroid.rnb.event.Join_Listener;

/**
 * 만약 중간에 취소된다면, User Table에 가장 나중에 저장된 아이디 지우기
 */
public class Join_nextpage  extends FragmentActivity {

    CheckBox cb_oily_skin;
    CheckBox cb_combination_skin;
    CheckBox cb_dry_skin;
    CheckBox cb_normal_skin;
    CheckBox cb_sensitive_skin;

    //private ArrayAdapter<String> mSpinnerAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_nextpage);

        cb_oily_skin = (CheckBox)findViewById(R.id.cb_oily_skin);
        cb_combination_skin = (CheckBox)findViewById(R.id.cb_combination_skin);
        cb_dry_skin = (CheckBox)findViewById(R.id.cb_dry_skin);
        cb_normal_skin = (CheckBox)findViewById(R.id.cb_normal_skin);
        cb_sensitive_skin = (CheckBox)findViewById(R.id.cb_sensitive_skin);


        Spinner spinner = (Spinner) findViewById(R.id.spinner_allergy);
        spinner.setOnItemSelectedListener(new Join_Listener());

        spinner.setPrompt(getResources().getString(R.string.allergy_prompt));
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.array_allergy,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new Join_Listener());

    }


    public void PlusButtonClicked(View v)throws Exception
    {
        //spinner 값 누를 때 마다 리스트에 넣어주기
        Toast.makeText(getApplicationContext(), "알레르기를 추가합니다.",Toast.LENGTH_LONG).show();

    }

    public void OkButtonClicked(View v)throws Exception
    {
        Intent i = new Intent(Join_nextpage.this, Menu.class);
        startActivity(i);
        finish();
        Toast.makeText(getApplicationContext(), "회원 가입을 완료합니다.",Toast.LENGTH_LONG).show();
    }

}