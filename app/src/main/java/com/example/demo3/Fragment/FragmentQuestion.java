package com.example.demo3.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo3.R;

/**
 * Created by arye on 2018/3/7.
 */

public class FragmentQuestion extends Fragment {

    public FragmentQuestion(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);
        return view;
    }
}
