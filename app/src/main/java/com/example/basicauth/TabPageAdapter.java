package com.example.basicauth;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.basicauth.fragments.HomeFragment;
import com.example.basicauth.fragments.NotificationsFragment;
import com.example.basicauth.fragments.SettingsFragment;

public class TabPageAdapter extends FragmentStateAdapter {

    private FragmentActivity activity;
    private Integer tabCount;

    public TabPageAdapter(FragmentActivity activity, Integer tabCount) {
        super(activity);
        this.activity = activity;
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return switch (position) {
            case 0 -> new HomeFragment();
            case 2 -> new SettingsFragment();
            case 1 -> new NotificationsFragment();
            default -> new HomeFragment();
        };
    }

    @Override
    public int getItemCount() {
        return tabCount;
    }
}
