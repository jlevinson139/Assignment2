package com.example.joel.assignment2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by joel on 2015-10-22.
 */
public class SelectFragment extends Fragment {
    public static String TAG = "SelectFragment";
    public SelectFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.select_fragmet, container, false);
        RadioGroup radioGroup =(RadioGroup) view.findViewById(R.id.rg);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                // checkedId is the RadioButton selected
                FragmentManager fm = getFragmentManager();
                switch (checkedId) {
                    case R.id.radioButton:
                        Fragment fragment = fm.findFragmentByTag(GetTimeFragment.TAG);
                        if(fragment == null){
                            fm.beginTransaction().replace(R.id.container, new GetTimeFragment(), GetTimeFragment.TAG).commit();

                        }else{
                            fm.beginTransaction().replace(R.id.container, new CountWordsFragment(), CountWordsFragment.TAG).commit();
                        }
                        break;
                    case R.id.radioButton2:
                        // Fragment 2
                        Fragment fragment2 = fm.findFragmentByTag(CountWordsFragment.TAG);
                        if(fragment2 == null){
                            fm.beginTransaction().replace(R.id.container, new CountWordsFragment(), CountWordsFragment.TAG).commit();

                        }else{
                            fm.beginTransaction().replace(R.id.container, new GetTimeFragment(), GetTimeFragment.TAG).commit();
                        }
                        break;
                }



            }
        });

        return view;
    }
}

