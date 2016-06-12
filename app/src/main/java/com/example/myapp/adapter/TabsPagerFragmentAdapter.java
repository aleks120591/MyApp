package com.example.myapp.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myapp.fragment.abstractTabFragment;
import com.example.myapp.fragment.birthdaysFragment;
import com.example.myapp.fragment.historyFragment;
import com.example.myapp.fragment.ideasFragment;
import com.example.myapp.fragment.todoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Warlock Aleks on 11.06.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, abstractTabFragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, birthdaysFragment.getFragment(context));
        tabs.put(1, ideasFragment.getFragment(context));
        tabs.put(2, todoFragment.getFragment(context));
        tabs.put(3, historyFragment.getFragment(context));
    }
}
