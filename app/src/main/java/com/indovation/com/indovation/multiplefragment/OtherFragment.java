package com.indovation.com.indovation.multiplefragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.indovation.fragmentsexample.R;
import com.indovation.utils.PTHelper;

/**
 * Created by Timothy on 3/17/2015.
 */
public class OtherFragment extends Fragment {

    public OtherFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_multiple_other, container, false);

        Button btnMultipleOther = (Button) rootView.findViewById(R.id.btn_multiple_fragment_other);

        btnMultipleOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),"You have clicked other fragments", Toast.LENGTH_SHORT).show();
                PTHelper.showPTToast(getActivity(), "You have clicked other fragments");
//                LayoutInflater inflater1 = getLayoutInflater(savedInstanceState);
//                View layout1 = inflater1.inflate(R.layout.toast_layout_root,null);
//                Toast toast111 = new Toast(getActivity().getApplicationContext());
//                toast111.setGravity(Gravity.BOTTOM, 0, 0);
//                toast111.setDuration(Toast.LENGTH_LONG);
//                TextView tv = (TextView) layout1.findViewById(R.id.toast_text);
//                tv.setText("This is a test");
//                toast111.setView(layout1);
//                toast111.show();
                Toast.makeText(getActivity(), "this is original toast", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
