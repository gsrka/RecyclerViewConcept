package com.remotetiger.viewpager_tabs_week2;

import android.content.Context;
import android.content.Intent;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Abhimanyu on 9/26/2017.
 */


public class ViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private String titles;
    private String descriptions;
    private int p;

    Context c;
    private ViewData data = new ViewData(titles, descriptions, p);

    public static final int zero = 1;
    public static final int one = 2;

    public ViewAdapter(ViewData data, Context c) {
        this.data = data;
        this.c = c;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType){
            case zero:View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemslist, null);
                return new ViewHolder(v);
            case one:View v1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemslist2, null);
                return new ViewHolder(v1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Intent i=new Intent(c, Detailed.class);

                //Need to get the parent activity and call its method.
                MainActivity mainActivity = (MainActivity) c;
                mainActivity.startActivityForResult(i, 1);
            }
        });

        if(holder.getItemViewType() == zero) {

            holder.title.setText(ViewData.newData[position].getTitlesm());
            holder.description.setText(ViewData.newData[position].getDescriptionsm());
            holder.image.setImageResource(ViewData.newData[position].getImagesm());
        }
        else if(holder.getItemViewType() == one) {
            holder.title.setText(ViewData.newData[position].getTitlesm());
            holder.description.setText(ViewData.newData[position].getDescriptionsm());
            holder.image.setImageResource(ViewData.newData[position].getImagesm());

        }
    }

    @Override
    public int getItemCount() {
        return 9;
    }

    @Override
    public int getItemViewType(int position) {
        return (position % 2 ==  0 ? zero : one);
    }

}

