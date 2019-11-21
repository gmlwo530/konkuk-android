package com.maru.how_much_doc.ui.reserve.adapter;

/*
 * Created by CHOI HEE JAE on 2019-11-21
 */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.maru.how_much_doc.ui.department.DepartmentFragment;
import com.maru.how_much_doc.ui.doctorandtime.DoctorAndTimeFragment;
import com.maru.how_much_doc.ui.estimate.EstimateFragment;
import com.maru.how_much_doc.ui.reservesummary.ReserveSummaryFragment;
import com.maru.how_much_doc.ui.selfdiagnosis.SelfDiagnosisFragment;

public class ReserveViewPagerFragmentAdapter extends FragmentStatePagerAdapter {

    public ReserveViewPagerFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return DepartmentFragment.newInstance();
            case 1:
                return SelfDiagnosisFragment.newInstance();
            case 2:
                return EstimateFragment.newInstance();
            case 3:
                return DoctorAndTimeFragment.newInstance();
            case 4:
                return ReserveSummaryFragment.newInstance();
        }
        return DepartmentFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
