package com.indovation.com.indovation.multiplefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.indovation.fragmentsexample.R;

/**
 * Created by Timothy on 3/17/2015.
 */
public class MenuFragment extends Fragment implements View.OnClickListener{

    Fragment frag;
    FragmentTransaction fragmentTransaction;
    public MenuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.multiple_menu,container,false);

        //Set default fragment on creation
        frag = new Mazda6Fragment();
        fragmentTransaction = getFragmentManager().beginTransaction().add(R.id.frame_multiple_fragment_container, frag);
        fragmentTransaction.commit();

        Button btnMazda6 = (Button)view.findViewById(R.id.btn_multiple_fragment_menu_mazda6);
        Button btnM4 = (Button)view.findViewById(R.id.btn_multiple_fragment_menu_m4);
        Button btnOther = (Button)view.findViewById(R.id.btn_multiple_fragment_menu_other);

        btnMazda6.setOnClickListener(this);
        btnM4.setOnClickListener(this);
        btnOther.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_multiple_fragment_menu_mazda6:
                frag = new Mazda6Fragment();
                break;

            case R.id.btn_multiple_fragment_menu_m4:
                frag = new M4Fragment();
                break;

            case R.id.btn_multiple_fragment_menu_other:
                frag = new OtherFragment();
                break;
        }
        fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.frame_multiple_fragment_container, frag);
        fragmentTransaction.commit();
    }
}
