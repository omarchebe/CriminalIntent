package com.criminalintent.omarche.criminalintent.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.criminalintent.omarche.criminalintent.BO.Crime;
import com.criminalintent.omarche.criminalintent.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Omar Che on 03/11/2015.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime,parent,false);
        initComponent(v);
        return v;
    }

    private void initComponent(View view) {
        mTitleField = (EditText) view.findViewById(R.id.crime_titile);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setmTitle(mCrime.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDateButton = (Button) view.findViewById(R.id.crime_date);
        //mDateButton.setText(mCrime.getmDate().toString());
        Date date = mCrime.getmDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        mDateButton.setText(sdf.format(date));
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox) view.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setmSolved(isChecked);
            }
        });
    }
}
