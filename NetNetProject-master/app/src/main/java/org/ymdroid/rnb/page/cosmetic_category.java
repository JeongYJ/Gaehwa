package org.ymdroid.rnb.page;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.ymdroid.rnb.R;
import org.ymdroid.rnb.event.ListData;
import org.ymdroid.rnb.event.ListViewAdapter;

/**
 * Created by kimminyoung on 2016-05-05.
 */
public class Cosmetic_category extends ActionBarActivity
{


    private ArrayAdapter<String> mSpinnerAdapter = null;
    private ListView mListView = null;
    private ListViewAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetic_category);
        getSupportActionBar().setTitle("화장품 카테고리");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0x00000000));

        mListView = (ListView) findViewById(R.id.listView);

        mAdapter = new ListViewAdapter(this);
        mListView.setAdapter(mAdapter);

        mAdapter.addItem(getResources().getDrawable(R.drawable.sample_image),
                "닥터솔루션 아큐어 클래리파잉 에멀전",
                "케어존");

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ListData mData = mAdapter.mListData.get(position);
                Toast.makeText(Cosmetic_category.this, mData.mTitle, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Cosmetic_category.this, Cosmetic_info.class);
                startActivity(i);
                finish();
            }
        });
    }

}

