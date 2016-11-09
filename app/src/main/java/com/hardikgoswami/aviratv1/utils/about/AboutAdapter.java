package com.hardikgoswami.aviratv1.utils.about;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hardikgoswami.aviratv1.R;

import java.util.List;

/**
 * Created by geniushkg on 10/30/2016.
 */

public class AboutAdapter extends RecyclerView.Adapter<AboutAdapter.AboutVH> {
    private List<About> mAboutMenuList;
    private Context mContext;

    public AboutAdapter(List<About> mAboutMenuList, Context mContext) {
        this.mAboutMenuList = mAboutMenuList;
        this.mContext = mContext;
    }


    @Override
    public AboutVH onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View aboutView = layoutInflater.inflate(R.layout.about_row, parent, false);
        AboutVH viewHolder = new AboutVH(aboutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AboutVH holder, int position) {
        About about = (About) mAboutMenuList.get(position);
        TextView aboutText = (TextView) holder.textViewMenu;
        ImageView aboutImage = (ImageView) holder.imageViewMenu;
        aboutText.setText(about.getMenuName());
        aboutImage.setImageResource(about.getIamgeId());
//        Picasso.with(mContext)
//                .load(about.getIamgeId())
//                .into(aboutImage);
    }


    @Override
    public int getItemCount() {
        return mAboutMenuList.size();
    }

    public static class AboutVH extends RecyclerView.ViewHolder {

        private static final String TAG ="AVIRAT" ;
        public TextView textViewMenu;
        public ImageView imageViewMenu;

        public AboutVH(View itemView ) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("AVIRAT","text from viewholder");
                }
            });
            textViewMenu = (TextView) itemView.findViewById(R.id.tv_rv_about);
            imageViewMenu = (ImageView) itemView.findViewById(R.id.iv_rv_about);
        }
    }
}
