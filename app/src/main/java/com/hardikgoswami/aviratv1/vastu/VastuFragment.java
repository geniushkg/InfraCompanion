package com.hardikgoswami.aviratv1.vastu;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hardikgoswami.aviratv1.R;
import com.hardikgoswami.aviratv1.utils.Vastu.ItemClickListener;
import com.hardikgoswami.aviratv1.utils.Vastu.Vastu;
import com.hardikgoswami.aviratv1.utils.Vastu.VastuAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class VastuFragment extends Fragment implements ItemClickListener {


    public VastuFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerViewVastu;
    List<Vastu> vastuList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.vastu_frag, container, false);
        vastuList = new ArrayList<Vastu>();
        vastuList.add(new Vastu("Entrance"));
        vastuList.add(new Vastu("Living Room"));
        vastuList.add(new Vastu("Dinning Room"));
        vastuList.add(new Vastu("Kitchen"));
        vastuList.add(new Vastu("Puja Room"));
        vastuList.add(new Vastu("Bedroom"));
        vastuList.add(new Vastu("Study Room"));
        vastuList.add(new Vastu("Bathroom"));
        vastuList.add(new Vastu("Master Bedroom"));

        recyclerViewVastu = (RecyclerView) rootView.findViewById(R.id.rv_vastu_container);
        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL_LIST);
        recyclerViewVastu.addItemDecoration(itemDecoration);
        VastuAdapter adapter = new VastuAdapter(getContext(),vastuList);
        recyclerViewVastu.setAdapter(adapter);
        recyclerViewVastu.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }

    @Override
    public void onClick(View view, int position) {
        //final City city = cities.get(position);
        Intent i = new Intent(getContext(), VastuDetailActivity.class);
        Log.i("TAG", "position is"+position);
        startActivity(i);
    }

}
