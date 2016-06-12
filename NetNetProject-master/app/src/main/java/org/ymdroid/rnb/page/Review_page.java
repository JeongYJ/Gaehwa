package org.ymdroid.rnb.page;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;


import org.ymdroid.rnb.R;
import org.ymdroid.rnb.event.ListReviewAdapter;
import org.ymdroid.rnb.key.Review;

/**
 * Created by yj on 16. 6. 12..
 */
public class Review_page extends ActionBarActivity {

    private ListView mListView = null;
    private ListReviewAdapter mAdapter = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        getSupportActionBar().setTitle("리뷰");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0x00000000));

        mListView = (ListView) findViewById(R.id.listView);
        mAdapter = new ListReviewAdapter(this);
        mListView.setAdapter(mAdapter);

        insertReview();
    }

    public void insertReview()
    {
        Review rv = new Review();
        double d1 = Math.random();
        //랜덤으로 점수 출력 (0~5)
/*
        for(int i=0; i<10; i++)
        {
            rv.name[i] = "User "+(i+1);
            rv.score[i] = (int)(d1 * 5)+1;
            rv.text[i] = "리뷰입니다.";

            switch(rv.score[i]) {
                case 0:
                {
                    mAdapter.addItem(rv.name[i],
                            getResources().getDrawable(R.drawable.score_zero),
                            rv.text[i]);
                    break;
                }
                case 1:
                {
                    mAdapter.addItem(rv.name[i],
                            getResources().getDrawable(R.drawable.score_one),
                            rv.text[i]);
                    break;
                }
                case 2:
                {
                    mAdapter.addItem(rv.name[i],
                            getResources().getDrawable(R.drawable.score_two),
                            rv.text[i]);
                    break;
                }
                case 3:
                {
                    mAdapter.addItem(rv.name[i],
                            getResources().getDrawable(R.drawable.score_three),
                            rv.text[i]);
                    break;
                }
                case 4:
                {
                    mAdapter.addItem(rv.name[i],
                            getResources().getDrawable(R.drawable.score_four),
                            rv.text[i]);
                    break;
                }
                case 5:
                {
                    mAdapter.addItem(rv.name[i],
                            getResources().getDrawable(R.drawable.score_five),
                            rv.text[i]);
                    break;
                }

            }

        }
        */
    }

}
