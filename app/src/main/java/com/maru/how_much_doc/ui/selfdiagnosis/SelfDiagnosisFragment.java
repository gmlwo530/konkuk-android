package com.maru.how_much_doc.ui.selfdiagnosis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.maru.how_much_doc.R;
import com.maru.how_much_doc.ui.reserve.ReserveViewModel;

public class SelfDiagnosisFragment extends Fragment {

    private ReserveViewModel reserveViewModel;

    public static SelfDiagnosisFragment newInstance(){
        return new SelfDiagnosisFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        reserveViewModel = ViewModelProviders.of(requireActivity()).get(ReserveViewModel.class);

        View root = inflater.inflate(R.layout.fragment_self_diagnosis, container, false);

        return root;
    }
}