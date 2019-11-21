package com.maru.how_much_doc.ui.reserve;

/*
 * Created by CHOI HEE JAE on 2019-11-21
 */

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class ReserveActivity extends AppCompatActivity {
    private ReserveViewModel reserveViewModel;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        reserveViewModel = ViewModelProviders.of(this).get(ReserveViewModel.class);
    }
}
