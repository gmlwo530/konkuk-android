package com.maru.how_much_doc.ui.reservesummary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.maru.how_much_doc.R;
import com.maru.how_much_doc.ui.reserve.ReserveViewModel;

public class ReserveSummaryFragment extends Fragment {
    private ReserveViewModel reserveViewModel;

    public static ReserveSummaryFragment newInstance(){
        return new ReserveSummaryFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        reserveViewModel = ViewModelProviders.of(requireActivity()).get(ReserveViewModel.class);

        View root = inflater.inflate(R.layout.fragment_reserve_summary, container, false);
        return root;
    }
}