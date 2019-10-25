package com.example.pinclassroom.ui.aulas;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    int counttab;
    public PageAdapter( FragmentManager fm, int counttab) {

        super(fm);
        this.counttab = counttab;
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {

        switch (i){

            case 0:
                TabAulas tabAulas = new TabAulas();
                return tabAulas;
            case 1  :
                TabMapa tabMapa = new TabMapa();
                return tabMapa;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return counttab;
    }
}
