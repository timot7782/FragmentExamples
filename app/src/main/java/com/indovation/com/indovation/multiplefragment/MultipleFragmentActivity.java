package com.indovation.com.indovation.multiplefragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.indovation.fragmentsexample.R;

public class MultipleFragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_fragment);
//        Typeface mFont = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
//        ViewGroup root = (ViewGroup)findViewById(R.id.multiple_fragment_layout);
//        Log.i(MainActivity.class.getSimpleName(), "setFont Started");
//        Log.i(MainActivity.class.getSimpleName(),String.format("child count = %d", root.getChildCount()));
//        MainActivity.setFont(root, mFont);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_multiple_fragment_menu, new MenuFragment())
                    .commit();
        }
    }

}
