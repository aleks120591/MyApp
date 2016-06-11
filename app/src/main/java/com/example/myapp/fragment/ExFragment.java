package com.example.myapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.R;

/**
 * Created by Warlock Aleks on 11.06.2016.
 */
public class ExFragment extends Fragment{

    View view;

    public static Fragment getFragment() {
        Bundle args = new Bundle();
        ExFragment fragment = new ExFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.exa_frag, container, false);
        return view;
    }
}
