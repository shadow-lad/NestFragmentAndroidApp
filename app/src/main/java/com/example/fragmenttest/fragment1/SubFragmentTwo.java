package com.example.fragmenttest.fragment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.fragmenttest.R;
import com.example.fragmenttest.databinding.FragmentSubTwoBinding;

public class SubFragmentTwo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSubTwoBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sub_two, container, false);
        return binding.getRoot();
    }
}