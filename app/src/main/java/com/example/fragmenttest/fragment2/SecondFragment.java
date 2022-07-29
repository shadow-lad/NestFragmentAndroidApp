package com.example.fragmenttest.fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.fragmenttest.MainActivity;
import com.example.fragmenttest.R;
import com.example.fragmenttest.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSecondBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavHostFragment fragment = (NavHostFragment) getChildFragmentManager().findFragmentById(R.id.fragment_nav_host);
        assert fragment != null;
        NavController controller = fragment.getNavController();

        NavigationUI.setupActionBarWithNavController(((MainActivity) requireActivity()), controller);
    }
}