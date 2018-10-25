package com.example.uyen.tablayoutviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout mTabLayout = findViewById(R.id.tabs);
        ViewPager mViewPager = findViewById(R.id.viewPager);

        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mAdapter.addFragment(new FirstFragment(), getResources().getString(R.string.first_title));
        mAdapter.addFragment(new ThirdFragment(), getResources().getString(R.string.second_title));
        mAdapter.addFragment(new SecondFragment(),getResources().getString(R.string.third_title));
        mViewPager.setAdapter(mAdapter);

        mTabLayout.setupWithViewPager(mViewPager);
    }
}
