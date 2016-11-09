package com.hardikgoswami.aviratv1.utils.Vastu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hardikgoswami.aviratv1.R;
import com.hardikgoswami.aviratv1.vastu.VastuFragment;

import java.util.List;

/**
 * Created by geniushkg on 10/29/2016.
 */

public class VastuAdapter extends RecyclerView.Adapter<VastuVH> {
    private List<Vastu> mVastuList;
    private Context mContext;

    public VastuAdapter(Context mContext, List<Vastu> mVastuList) {
        this.mContext = mContext;
        this.mVastuList = mVastuList;
    }

    @Override
    public VastuVH onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View VastView = inflater.inflate(R.layout.vastu_row,parent,false);
        VastuVH vastuVH = new VastuVH(VastView);

        return vastuVH;
    }

    @Override
    public void onBindViewHolder(VastuVH holder, int position) {
        Vastu vastu = (Vastu) mVastuList.get(position);
        TextView textView = holder.vastuName;
        textView.setText(vastu.getName());
    }

    @Override
    public int getItemCount() {
        return mVastuList.size();
    }

}
