package com.example.myapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.R;

/**
 * Created by Warlock Aleks on 11.06.2016.
 */
public class birthdaysFragment extends abstractTabFragment{

    private static final int LAYOUT = R.layout.exa_frag;

    public static birthdaysFragment getFragment(Context context) {
        Bundle args = new Bundle();
        birthdaysFragment fragment = new birthdaysFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
