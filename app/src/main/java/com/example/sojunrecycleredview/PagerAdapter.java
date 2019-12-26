package com.example.sojunrecycleredview;
import android.support.annotation.Nullable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> list;
    String[] title=new String[]{"history","graph","connect","setting"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        list = new ArrayList<>();
        list.add(new fragment_list());
//        list.add(new BorrowserviceFragment());
//        // list.add(new StartActivity());
//        list.add(new Fragment_Bluetooth());
    }
    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return list.size();
    }
}