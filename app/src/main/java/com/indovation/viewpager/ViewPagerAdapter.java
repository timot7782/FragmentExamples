package com.indovation.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.indovation.fragmentsexample.R;

/**
 * Created by Timothy on 3/19/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int[] images = {R.drawable.mazda6, R.drawable.m4, R.drawable.cls_amg,
            R.drawable.gtr_r35, R.drawable.range_rover, R.drawable.tesla_model_s};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) { //change image when we swipe
        return MyViewPagerFragment.newInstance(position,images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
