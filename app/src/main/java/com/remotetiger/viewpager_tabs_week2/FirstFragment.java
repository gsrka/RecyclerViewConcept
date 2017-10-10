package com.remotetiger.viewpager_tabs_week2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Abhimanyu on 9/26/2017.
 */

public class FirstFragment extends Fragment {

    RecyclerView rv;

    int images;
    String titles;
    String descriptions;

    Context c = getContext();
    ViewData abc;
    public FirstFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Context ct = getContext();

        View v = inflater.inflate(R.layout.first_fragment, null);
        rv = (RecyclerView)v.findViewById(R.id.recycleview);
        rv.setHasFixedSize(true);
        abc = new ViewData(titles, descriptions, images);
        rv.setAdapter(new ViewAdapter(abc, ct));
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }


}


