package com.example.pinclassroom.ui.aulas;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.pinclassroom.R;
import com.google.android.material.tabs.TabLayout;

public class AulasActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_aulas);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        ViewPager pager = (ViewPager)findViewById(R.id.ViewPagerAulas);
        tabLayout.setupWithViewPager(pager);
    }
}
