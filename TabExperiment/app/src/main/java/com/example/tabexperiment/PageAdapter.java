package com.example.tabexperiment;

import android.support.v4.app.FragmentStatePageAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class PageAdapter extends FragmentStatePageAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
    public Fragment getItem (int position) {
        switch (position) {
            case 0 : return new TabFragment1();
            case 1 : return new TabFragment2();
            case 2 : return new TabFragment3();
            default: return null;
        }
    }

    public int getCount(){
        return mNumOfTabs;
    }
}
