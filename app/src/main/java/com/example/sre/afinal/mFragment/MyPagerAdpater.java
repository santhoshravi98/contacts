package com.example.sre.afinal.mFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by sre on 11/24/17.
 */

public class MyPagerAdpater extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments=new ArrayList<>();

    public MyPagerAdpater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

public void addFragment(Fragment f)
{
    fragments.add(f);
}

    @Override
    public CharSequence getPageTitle(int position) {
        String title=fragments.get(position).toString();
        return title.toString();

    }

}
