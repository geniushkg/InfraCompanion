package com.hardikgoswami.aviratv1.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.hardikgoswami.aviratv1.R;
import com.hardikgoswami.aviratv1.about.AboutFragment;
import com.hardikgoswami.aviratv1.project.ProjectFragment;
import com.hardikgoswami.aviratv1.utils.ItemClickSupport;
import com.hardikgoswami.aviratv1.utils.Menu.MenuAdapter;
import com.hardikgoswami.aviratv1.utils.Menu.MenuModel;
import com.hardikgoswami.aviratv1.vastu.VastuFragment;

import java.util.List;

import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;


public class HomeFragment extends Fragment {

    List<MenuModel> menuModels;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.home_frag, container, false);
        ImageView imageViewHome = (ImageView) rootView.findViewById(R.id.iv_home_frag);
        // animate image
        Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.view_slide_up);
        imageViewHome.startAnimation(anim);
        // setup recycler view
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_menu);
        menuModels = MenuModel.createMenuList();
        final MenuAdapter adapter = new MenuAdapter(menuModels, getContext());
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager grid = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(grid);
        recyclerView.setItemAnimator(new SlideInUpAnimator());
        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                //Toast.makeText(getContext(),"pos :"+position,Toast.LENGTH_SHORT).show();
                Fragment fragment = new Fragment();
                switch (position) {
                    case 0:
                        fragment = new AboutFragment();
                        break;
                    case 1:
                        fragment = new ProjectFragment();
                        break;
                    case 2:
                        fragment = new VastuFragment();
                        break;
                    case 3:
                        fragment = new VastuFragment();
                        break;
                    default:
                        Toast.makeText(getContext(), "default case", Toast.LENGTH_SHORT).show();
                        break;

                }

                FragmentTransaction tx = getActivity().getSupportFragmentManager().beginTransaction();
                tx.replace(R.id.content_main, fragment);
                tx.commit();

            }
        });

        return rootView;
    }


}
