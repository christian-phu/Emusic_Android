package com.thv.hoangvu.Emusic.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thv.hoangvu.Emusic.Adapter.MainViewPagerAdapter;
import com.thv.hoangvu.Emusic.Fragment.FragmentMyAccount;
import com.thv.hoangvu.Emusic.Fragment.FragmentTimKiem;
import com.thv.hoangvu.Emusic.Fragment.FragmentTrangChu;
import com.thv.hoangvu.appnhac.R;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        init();
    }

    public void init() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new FragmentTrangChu(), "Trang Chủ");
        mainViewPagerAdapter.addFragment(new FragmentTimKiem(), "Tìm Kiếm");
        mainViewPagerAdapter.addFragment(new FragmentMyAccount(), "Cài đặt");
        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.homes);
        tabLayout.getTabAt(1).setIcon(R.drawable.search);
        tabLayout.getTabAt(2).setIcon(R.drawable.setting);
    }

    public void anhXa(){
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewPager);
    }
}
