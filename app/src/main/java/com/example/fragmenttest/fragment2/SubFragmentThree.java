package com.example.fragmenttest.fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.fragmenttest.R;
import com.example.fragmenttest.databinding.FragmentSubThreeBinding;

public class SubFragmentThree extends Fragment {
    private FragmentSubThreeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sub_three, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.subFragmentFourButton
                .setOnClickListener(v -> NavHostFragment.findNavController(this)
                        .navigate(R.id.action_subFragmentThree_to_subFragmentFour));
    }
}