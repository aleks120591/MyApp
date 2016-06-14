package com.example.myapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.R;
import com.example.myapp.adapter.RemindListAdapter;
import com.example.myapp.dto.RemindDTO;

import java.util.List;

/**
 * Created by Warlock Aleks on 11.06.2016.
 */
public class historyFragment extends abstractTabFragment{

    private static final int LAYOUT = R.layout.his_frag;

    private List<RemindDTO> data;
    private RemindListAdapter adapter;

    public static historyFragment getFragment(Context context, List<RemindDTO> data) {
        Bundle args = new Bundle();
        historyFragment fragment = new historyFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setData(data);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        adapter = new RemindListAdapter(data);
        rv.setAdapter(adapter);
        return view;
    }

    public void refreshList(List<RemindDTO> data) {
        adapter.setData(data);
        adapter.notifyDataSetChanged();
    }

    public void setContext(Context context) {
        this.context = context;
    }
    public void setData(List<RemindDTO> data) {
        this.data = data;
    }
}
