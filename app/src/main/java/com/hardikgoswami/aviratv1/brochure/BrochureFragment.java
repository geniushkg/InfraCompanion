package com.hardikgoswami.aviratv1.brochure;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hardikgoswami.aviratv1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BrochureFragment extends Fragment {


    public BrochureFragment() {
        // Required empty public constructor
    }


    CardView cardView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.brochure_frag, container, false);
        cardView = (CardView)rootView.findViewById(R.id.cv_liveproject_brochure);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PdfActivity.class);
                startActivity(intent);
            }
        });
        
        return rootView;
                
        
    }

}
