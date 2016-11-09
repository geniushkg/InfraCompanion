package com.hardikgoswami.aviratv1.faq;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hardikgoswami.aviratv1.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FaqFragment extends Fragment {


    public FaqFragment() {
        // Required empty public constructor
    }


    TextView textViewFaq;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.faq_frag, container, false);

        textViewFaq = (TextView)rootView.findViewById(R.id.tv_faq_qa);
        textViewFaq.setText(Html.fromHtml(getString(R.string.faq_data)));



        return rootView;
    }

}
