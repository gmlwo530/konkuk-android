package com.maru.how_much_doc.ui.doctorandtime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.maru.how_much_doc.R;
import com.maru.how_much_doc.ui.reserve.ReserveViewModel;

public class DoctorAndTimeFragment extends Fragment {
    private ReserveViewModel reserveViewModel;

    public static DoctorAndTimeFragment newInstance(){
        return new DoctorAndTimeFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        reserveViewModel = ViewModelProviders.of(requireActivity()).get(ReserveViewModel.class);

        View root = inflater.inflate(R.layout.fragment_doctor_and_time, container, false);
        return root;
    }
}