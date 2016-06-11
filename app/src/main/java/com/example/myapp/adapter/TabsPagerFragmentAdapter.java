package com.example.myapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myapp.fragment.ExFragment;

/**
 * Created by Warlock Aleks on 11.06.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);

        tabs = new String[]{
                "Tab 1",
                "Tab 2",
                "Tab 3"
        };

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return ExFragment.getFragment();
            }
            case 1:{
                return ExFragment.getFragment();
            }
            case 2:{
                return ExFragment.getFragment();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
