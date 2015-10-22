package com.example.joel.assignment2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by joel on 2015-10-16.
 */
public class GetTimeFragment extends Fragment {
    public static String TAG = "GetTimeFragment";
    public GetTimeFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.get_time_fragment, container, false);

        TextView txt = (TextView) view.findViewById(R.id.textView2);
        txt.setText("Get Time");
        return view;
    }
}

