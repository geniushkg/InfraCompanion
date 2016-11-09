package com.hardikgoswami.aviratv1.about;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hardikgoswami.aviratv1.R;
import com.hardikgoswami.aviratv1.SplashActivity;
import com.hardikgoswami.aviratv1.home.HomeFragment;
import com.hardikgoswami.aviratv1.home.MainActivity;
import com.hardikgoswami.aviratv1.utils.ItemClickSupport;
import com.hardikgoswami.aviratv1.utils.about.About;
import com.hardikgoswami.aviratv1.utils.about.AboutAdapter;
import com.hardikgoswami.aviratv1.vastu.DividerItemDecoration;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }

    List<About> mAboutList;
    RecyclerView recyclerViewAbout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.about_frag, container, false);
        mAboutList = new ArrayList<About>();
        mAboutList.add(new About("About Us",R.drawable.home));
        mAboutList.add(new About("Vision",R.drawable.home));
        mAboutList.add(new About("Philosophy",R.drawable.home));
        mAboutList.add(new About("Team",R.drawable.home));
        mAboutList.add(new About("Quality",R.drawable.home));
        mAboutList.add(new About("Future Plans",R.drawable.home));
        mAboutList.add(new About("Resposiblity",R.drawable.home));
        mAboutList.add(new About("Area Developer",R.drawable.home));
        mAboutList.add(new About("Resposiblity",R.drawable.home));

        recyclerViewAbout = (RecyclerView)rootView.findViewById(R.id.rv_about_container);
        AboutAdapter aboutAdapter = new AboutAdapter(mAboutList,getContext());
        recyclerViewAbout.setAdapter(aboutAdapter);
        recyclerViewAbout.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewAbout.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL_LIST));
        ItemClickSupport.addTo(recyclerViewAbout).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent intent = new Intent(getActivity(), AboutActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }

}
