package com.indovation.com.indovation.multiplefragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.indovation.fragmentsexample.R;

/**
 * Created by Timothy on 3/17/2015.
 */
public class Mazda6Fragment extends Fragment {

    public Mazda6Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_multiple_mazda6, container, false);

        return rootView;
    }
}
