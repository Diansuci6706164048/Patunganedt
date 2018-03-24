package org.d3ifcool.patungan_edt;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class DashboardActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    private TextView dashboardTitleTextView;
    Typeface coquette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        coquette = Typeface.createFromAsset(getAssets(), "fonts/coquette.ttf");

        dashboardTitleTextView = (TextView) findViewById(R.id.dashboard_title_textview);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        appBarLayout = (AppBarLayout) findViewById(R.id.appBar);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new FragmentTimeline(), "Timeline");
        viewPagerAdapter.addFragment(new FragmentTransaction(), "Transaction");
        viewPagerAdapter.addFragment(new FragmentProfile(), "Profile");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        dashboardTitleTextView.setTypeface(coquette);


    }
}

