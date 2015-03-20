package com.indovation.fragmentsexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.indovation.com.indovation.multiplefragment.MultipleFragmentActivity;
import com.indovation.simplefragment.SimpleFragmentActivity;
import com.indovation.viewpager.ViewPagerActivity;

//import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Typeface mFont = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
//        ViewGroup root = (ViewGroup)findViewById(R.id.container);
////        Log.i(MainActivity.class.getSimpleName(),"setFont Started");
////        Log.i(MainActivity.class.getSimpleName(),String.format("child count = %d", root.getChildCount()));
//        setFont(root, mFont);
//        Log.i(MainActivity.class.getSimpleName(),"setFont Ended");
    }

    /*
     * Sets the font on all TextViews in the ViewGroup. Searches
     * recursively for all inner ViewGroups as well. Just add a
     * check for any other views you want to set as well (EditText,
     * etc.)
     */
//    public static void setFont(ViewGroup group, Typeface font) {
//
//        int count = group.getChildCount();
//        View v;
//        for(int i = 0; i < count; i++) {
//            v = group.getChildAt(i);
//            if(v instanceof TextView || v instanceof Button /*etc.*/)
//                ((TextView)v).setTypeface(font);
//            else if(v instanceof ViewGroup)
//                setFont((ViewGroup)v, font);
//        }
//    }

    public void simpleFragment (View view) {
        //how to produce a custom toast without using XML
//        Toast ImageToast = new Toast(getBaseContext());
//        LinearLayout toastLayout = new LinearLayout(
//                getBaseContext());
//        toastLayout.setOrientation(LinearLayout.HORIZONTAL);
//        ImageView image = new ImageView(getBaseContext());
//        image.setImageResource(R.drawable.abc_ic_menu_share_mtrl_alpha);
//        image.setBackgroundColor(getResources().getColor(R.color.background_floating_material_dark));
//        TextView tv = new TextView(getBaseContext());
//        tv.setTextColor(getResources().getColor(R.color.background_floating_material_light));
//        tv.setText("this is amazing");
//        tv.setBackgroundColor(getResources().getColor(R.color.background_floating_material_dark));
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
//        params.weight = 1.0f;
//        image.setLayoutParams(params);
//        tv.setLayoutParams(params);
//        tv.setGravity(Gravity.CENTER);
//        toastLayout.addView(image);
//        toastLayout.addView(tv);
//        ImageToast.setView(toastLayout);
//        ImageToast.setDuration(Toast.LENGTH_SHORT);
//        ImageToast.show();
        startActivity(new Intent(this, SimpleFragmentActivity.class));
    }

    public void viewPagerFragment (View view) {
        startActivity(new Intent(this, ViewPagerActivity.class));
    }

    public void multipleFragment (View view) {
        startActivity(new Intent(this, MultipleFragmentActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
