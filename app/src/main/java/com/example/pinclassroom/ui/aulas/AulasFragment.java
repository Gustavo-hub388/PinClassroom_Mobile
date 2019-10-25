package com.example.pinclassroom.ui.aulas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.pinclassroom.R;
import com.google.android.material.tabs.TabLayout;

public class AulasFragment extends Fragment {

    private AulasViewModel aulasViewModel;

    private TabAulas aulas;

    private PageAdapter tabs;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        aulasViewModel = ViewModelProviders.of(this).get(AulasViewModel.class);

        View root = inflater.inflate(R.layout.fragment_aulas, container, false);

        TabLayout tabLayout = root.findViewById(R.id.tabs_aulas);
        tabLayout.addTab(tabLayout.newTab().setText("Aulas" ));
        tabLayout.addTab(tabLayout.newTab().setText("Mapa"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = root.findViewById(R.id.ViewPagerAulas);
        PageAdapter pageAdapter = new PageAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        /*aulasViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/


        return root;
    }

}