package com.hardikgoswami.aviratv1.utils.Menu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hardikgoswami.aviratv1.R;

import java.util.List;

/**
 * Created by geniushkg on 10/27/2016.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private List<MenuModel> menuModels;
    private Context mContext;

    public MenuAdapter(List<MenuModel> menuModels, Context mContext) {
        this.menuModels = menuModels;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View menuView = inflater.inflate(R.layout.rv_menu_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(menuView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MenuModel menuModel = menuModels.get(position);
        TextView textView = holder.tv_row;
        textView.setText(menuModel.getMenuName());
        ImageView imageView = holder.iv_row;
        int id = menuModel.getImageResId();
        imageView.setImageResource(id);
    }

    @Override
    public int getItemCount() {
        return menuModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_row;
        TextView tv_row;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_row = (ImageView) itemView.findViewById(R.id.iv_rv_menu);
            tv_row = (TextView) itemView.findViewById(R.id.tv_rv_menu);
        }
    }
}
