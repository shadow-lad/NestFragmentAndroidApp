package com.example.fragmenttest.fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.fragmenttest.R;
import com.example.fragmenttest.databinding.FragmentSubFourBinding;

public class SubFragmentFour extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSubFourBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sub_four, container, false);
        return binding.getRoot();
    }

}