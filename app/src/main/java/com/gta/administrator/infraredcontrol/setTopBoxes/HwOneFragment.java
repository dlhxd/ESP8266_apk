package com.gta.administrator.infraredcontrol.setTopBoxes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gta.administrator.infraredcontrol.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HwOneFragment extends Fragment {


    public HwOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hw_one_control, container, false);
    }

}