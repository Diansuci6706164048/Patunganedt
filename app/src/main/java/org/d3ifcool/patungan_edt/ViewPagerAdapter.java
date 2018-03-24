package org.d3ifcool.patungan_edt;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> listFragment = new ArrayList<>();
    private final ArrayList<String> listFragmentTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragmentTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listFragmentTitles.get(position);
    }

    public void addFragment(Fragment newFragment, String fragmentTitle) {
        listFragment.add(newFragment);
        listFragmentTitles.add(fragmentTitle);
    }
}
