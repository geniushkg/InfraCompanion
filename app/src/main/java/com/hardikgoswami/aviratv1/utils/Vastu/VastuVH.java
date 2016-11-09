package com.hardikgoswami.aviratv1.utils.Vastu;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.hardikgoswami.aviratv1.R;

/**
 * Created by geniushkg on 10/29/2016.
 */

public class VastuVH extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView vastuName;
    ItemClickListener clickListener;

    public VastuVH(View itemView, TextView vastuName, ItemClickListener clickListener) {
        super(itemView);
        this.vastuName = vastuName;
        this.clickListener = clickListener;
    }

    public VastuVH(View itemView) {
        super(itemView);
        vastuName = (TextView) itemView.findViewById(R.id.tv_rv_vastu);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(clickListener != null) {
            clickListener.onClick(v, getAdapterPosition());
        }else {
            Log.d("TAG","clicklistener null");
        }
    }
}
