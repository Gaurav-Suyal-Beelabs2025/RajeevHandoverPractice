package com.example.newapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SurroundViewPagerAdapter extends FragmentStatePagerAdapter {


    public SurroundViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new MineFragment();
        }else if (position == 1){
            return new NearByFragment();
        }else if (position == 2){
            return new NewestFragment();
        }else if (position == 3){
            return new PopularFragment();
        }else{
            return new FollowingFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Mine";
        }else if (position == 1){
            return "NearBy";
        }else if (position == 2){
            return "Newest";
        }else if (position == 3){
            return "Popular";
        }else {
            return "Following";
        }
    }
}
