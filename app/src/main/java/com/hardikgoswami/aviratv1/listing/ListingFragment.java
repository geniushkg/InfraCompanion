package com.hardikgoswami.aviratv1.listing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hardikgoswami.aviratv1.R;
import com.hardikgoswami.aviratv1.utils.listing.ListingAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListingFragment extends Fragment {


    public ListingFragment() {
        // Required empty public constructor
    }


    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listing_row, container, false);
        //recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_listing_frag_container);
//        ListingAdapter adapter = new ListingAdapter(getContext());
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        return rootView;
    }

}
