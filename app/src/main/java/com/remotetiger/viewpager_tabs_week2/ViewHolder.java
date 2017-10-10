package com.remotetiger.viewpager_tabs_week2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Abhimanyu on 9/26/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView title,description;
    public ImageView image;
    ItemClickListener itemClickListener;

    public ViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        image = (ImageView) itemView.findViewById(R.id.image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener=ic;
    }
}
