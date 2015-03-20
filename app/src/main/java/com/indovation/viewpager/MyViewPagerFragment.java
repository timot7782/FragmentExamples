package com.indovation.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.indovation.fragmentsexample.R;

/**
 * Created by Timothy on 3/19/2015.
 */
public class MyViewPagerFragment extends Fragment {

    private static final String IMAGE_POSITION = "imagePosition";
    private static final String IMAGE_RES_ID = "imageID";

    public MyViewPagerFragment() {  //default constructor is needed
    }

    public static MyViewPagerFragment newInstance (int imagePosition, int imageID) {
        MyViewPagerFragment myfrag = new MyViewPagerFragment();

        Bundle bundle = new Bundle();
        bundle.putInt(IMAGE_POSITION, imagePosition);
        bundle.putInt(IMAGE_RES_ID, imageID);
        myfrag.setArguments(bundle);

        return myfrag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);

        ImageView iv = (ImageView) rootView.findViewById(R.id.iv_view_pager);
//        TextView tv = (TextView) rootView.findViewById(R.id.tv_view_pager_page_num);
        Bundle bundle = getArguments();
        int position = bundle.getInt(IMAGE_POSITION);
        int resID = bundle.getInt(IMAGE_RES_ID);
//        iv.setImageBitmap(
//                PTHelper.decodeSampledBitmapFromResource(getResources(), resID, 1080, 1920));
        iv.setImageResource(resID);
//        tv.setText(String.format("Page number: %d", position + 1));

        return rootView;
    }
}
