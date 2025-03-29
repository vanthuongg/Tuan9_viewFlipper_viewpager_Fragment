package com.example.tuan9.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tuan9.Model.CancelFragment;
import com.example.tuan9.Model.DanhGiaFragment;
import com.example.tuan9.Model.DeliveryFragment;
import com.example.tuan9.Model.NewOrderFragment;
import com.example.tuan9.Model.PickUpFragment;

public class ViewPager2Adapter extends FragmentStateAdapter {

    public ViewPager2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new NewOrderFragment();
            case 1:
                return new PickUpFragment();
            case 2:
                return new DeliveryFragment();
            case 3:
                return new DanhGiaFragment();
            case 4:
                return new CancelFragment();
            default:
                return new NewOrderFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

