package com.example.myapp.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myapp.dto.RemindDTO;
import com.example.myapp.fragment.abstractTabFragment;
import com.example.myapp.fragment.birthdaysFragment;
import com.example.myapp.fragment.historyFragment;
import com.example.myapp.fragment.ideasFragment;
import com.example.myapp.fragment.todoFragment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Warlock Aleks on 11.06.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, abstractTabFragment> tabs;

    private List<RemindDTO> data;
    private historyFragment historyFragment;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm, List<RemindDTO> data) {
        super(fm);
        this.data = data;
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
        historyFragment = historyFragment.getFragment(context, data);
        tabs.put(0, birthdaysFragment.getFragment(context));
        tabs.put(1, ideasFragment.getFragment(context));
        tabs.put(2, todoFragment.getFragment(context));
        tabs.put(3, historyFragment.getFragment(context, data));
    }
    public void setData(List<RemindDTO> data) {
        this.data = data;
        historyFragment.refreshList(data);
    }
}
