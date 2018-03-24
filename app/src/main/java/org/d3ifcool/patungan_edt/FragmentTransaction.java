package org.d3ifcool.patungan_edt;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class FragmentTransaction extends Fragment {

    private View view;

    public FragmentTransaction(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.transaction_fragment, container, false);
        return view;
    }
}
