package com.example.sre.afinal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;

import com.example.sre.afinal.mFragment.Creative;
import com.example.sre.afinal.mFragment.Content;
import com.example.sre.afinal.mFragment.Design;
import com.example.sre.afinal.mFragment.Marketing;
import com.example.sre.afinal.mFragment.MyPagerAdpater;
import com.example.sre.afinal.mFragment.brandrelations;
import com.example.sre.afinal.mFragment.events;
import com.example.sre.afinal.mFragment.finance;
import com.example.sre.afinal.mFragment.guestlectures;
import com.example.sre.afinal.mFragment.hospitality;
import com.example.sre.afinal.mFragment.hr;
import com.example.sre.afinal.mFragment.industrialrelations;
import com.example.sre.afinal.mFragment.logistics;
import com.example.sre.afinal.mFragment.media;
import com.example.sre.afinal.mFragment.projects;
import com.example.sre.afinal.mFragment.promo;
import com.example.sre.afinal.mFragment.qac;
import com.example.sre.afinal.mFragment.tech;
import com.example.sre.afinal.mFragment.workshops;
import com.example.sre.afinal.mFragment.xceed;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener,ViewPager.OnPageChangeListener  {
    ViewPager vp;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        vp=(ViewPager)findViewById(R.id.mViewpager_ID);
        this.addPages();
        tabLayout= (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(vp);

        tabLayout.setOnTabSelectedListener(this);


    }
    private void addPages()
    {
        MyPagerAdpater pagerAdapter=new MyPagerAdpater(this.getSupportFragmentManager());
     pagerAdapter.addFragment(new Content());
        pagerAdapter.addFragment(new Creative());
        pagerAdapter.addFragment(new Design());
        pagerAdapter.addFragment(new promo());
        pagerAdapter.addFragment(new events());
        pagerAdapter.addFragment(new workshops());
        pagerAdapter.addFragment(new xceed());
        pagerAdapter.addFragment(new brandrelations());
        pagerAdapter.addFragment(new guestlectures());
        pagerAdapter.addFragment(new industrialrelations());
        pagerAdapter.addFragment(new finance());
        pagerAdapter.addFragment(new hospitality());
        pagerAdapter.addFragment(new logistics());
        pagerAdapter.addFragment(new Marketing());
        pagerAdapter.addFragment(new media());
        pagerAdapter.addFragment(new hr());
        pagerAdapter.addFragment(new qac());
        pagerAdapter.addFragment(new projects());
        pagerAdapter.addFragment(new tech());
        vp.setAdapter(pagerAdapter);
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
