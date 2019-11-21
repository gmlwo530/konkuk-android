package com.maru.how_much_doc.ui.department;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.maru.how_much_doc.R;
import com.maru.how_much_doc.ui.home.HomeViewModel;
import com.maru.how_much_doc.ui.reserve.ReserveViewModel;

public class DepartmentFragment extends Fragment {
    private ReserveViewModel reserveViewModel;

    public static DepartmentFragment newInstance(){
        return new DepartmentFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        reserveViewModel = ViewModelProviders.of(requireActivity()).get(ReserveViewModel.class);

        View root = inflater.inflate(R.layout.fragment_department, container, false);
        return root;
    }
}