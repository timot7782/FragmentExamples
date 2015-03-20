package com.indovation.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.indovation.fragmentsexample.R;
import com.viewpagerindicator.CirclePageIndicator;

public class ViewPagerActivity extends ActionBarActivity {

    private ViewPager pager;
    private ViewPagerAdapter adapter;
    private CirclePageIndicator cpiIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        cpiIndicator = (CirclePageIndicator) findViewById(R.id.cpi_view_pager_indicator);
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());    //this will give all the fragments

        pager.setAdapter(adapter);
        Log.i("FUCKTHIS",String.format("cpiIndicator ==%d==",cpiIndicator.getId()));
        cpiIndicator.setViewPager(pager);
    }

}
