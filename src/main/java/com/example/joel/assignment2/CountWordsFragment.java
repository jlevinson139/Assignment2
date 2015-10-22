package com.example.joel.assignment2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by joel on 2015-10-16.
 */
public class CountWordsFragment extends Fragment {
    public static String TAG = "CountWordsFragment";
    public CountWordsFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.count_words_fragment, container, false);

        TextView txt = (TextView) view.findViewById(R.id.textView);
        txt.setText("Count Words");

        return view;
    }
}

