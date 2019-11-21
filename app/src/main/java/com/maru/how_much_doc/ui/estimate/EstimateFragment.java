package com.maru.how_much_doc.ui.estimate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.maru.how_much_doc.R;
import com.maru.how_much_doc.ui.reserve.ReserveViewModel;

public class EstimateFragment extends Fragment {

    private ReserveViewModel reserveViewModel;

    public static EstimateFragment newInstance(){
        return new EstimateFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        reserveViewModel = ViewModelProviders.of(requireActivity()).get(ReserveViewModel.class);

        View root = inflater.inflate(R.layout.fragment_estimate, container, false);

        return root;
    }
}