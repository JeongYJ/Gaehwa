package org.ymdroid.rnb.page;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import org.ymdroid.rnb.R;
import org.ymdroid.rnb.event.ListData;
import org.ymdroid.rnb.event.ListViewAdapter;

/**
 * Created by kimminyoung on 2016-05-05.
 */
public class Cosmetic_category extends ActionBarActivity implements AdapterView.OnItemSelectedListener
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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_bar, menu);

        MenuItem item = menu.findItem(R.id.spinner);
        Spinner spinner = (Spinner) MenuItemCompat.getActionView(item);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner.setBackgroundColor(Color.parseColor("#ffffff"));


        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.spinner) {
            Toast.makeText(this, "액션버튼 이벤트", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

