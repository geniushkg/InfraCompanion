package com.hardikgoswami.aviratv1.project;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.hardikgoswami.aviratv1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectFragment extends Fragment {


    public ProjectFragment() {
        // Required empty public constructor
    }


    ImageView iv1,iv2,iv3;
    CardView cardView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.project_frag, container, false);
        iv1 = (ImageView) rootView.findViewById(R.id.iv_project_frag_cv1);
        iv2 = (ImageView) rootView.findViewById(R.id.iv_project_frag_cv2);
        iv3 = (ImageView) rootView.findViewById(R.id.iv_project_frag_cv3);
        cardView = (CardView)rootView.findViewById(R.id.cv_liveproject);
        Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.view_slide_up);
        iv1.startAnimation(anim);
        iv2.startAnimation(anim);
        iv3.startAnimation(anim);

        //setup onclick listener on cardview
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ProjectDetailsActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }

}
