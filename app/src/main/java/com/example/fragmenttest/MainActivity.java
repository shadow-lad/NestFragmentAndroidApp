package com.example.fragmenttest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.fragmenttest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private NavHostFragment activityNavHostFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_main, null, true);
        setContentView(binding.getRoot());

        activityNavHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.main_nav_host_fragment);
        assert activityNavHostFragment != null;
        NavigationUI.setupWithNavController(binding.bottomNav, activityNavHostFragment.getNavController());

    }

    @Override
    public boolean onSupportNavigateUp() {

        NavHostFragment fragmentNavHostFragment1 = (NavHostFragment) activityNavHostFragment.getChildFragmentManager()
                .getFragments().get(0)
                .getChildFragmentManager()
                .findFragmentById(R.id.fragment_nav_host);

        NavController fragmentController1 = fragmentNavHostFragment1 != null ? fragmentNavHostFragment1.getNavController() : null;

        if (fragmentController1 != null)
            return fragmentController1.navigateUp();

        return super.onSupportNavigateUp();
    }
}