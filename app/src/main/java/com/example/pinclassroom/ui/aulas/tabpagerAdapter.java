package com.example.pinclassroom.ui.aulas;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.Map;

public class tabpagerAdapter extends FragmentPagerAdapter {

    String [] tabAulasArray = new String[]{"Aulas", "Mapa"};

    public tabpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabAulasArray[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                Aulas aulas1 = new Aulas();
                return aulas1;
            case 1:
                Mapa mapa1 = new Mapa();
                return mapa1;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
