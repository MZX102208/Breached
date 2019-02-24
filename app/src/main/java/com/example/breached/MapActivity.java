package com.example.breached;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MapActivity extends AppCompatActivity {

    private int mCurrentPage = 0;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment currentFragment = new MapFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if (mCurrentPage == 0) return true;
                    ft.replace(R.id.content, currentFragment);
                    ft.commit();
                    mCurrentPage = 0;
                    return true;
                case R.id.navigation_dashboard:
                    if (mCurrentPage == 1) return true;
                    currentFragment = new ReportFragment();
                    ft.replace(R.id.content, currentFragment);
                    ft.commit();
                    mCurrentPage = 1;
                    return true;
                case R.id.navigation_notifications:
                    if (mCurrentPage == 2) return true;
                    currentFragment = new ReportFragment();
                    ft.replace(R.id.content, currentFragment);
                    ft.commit();
                    mCurrentPage = 2;
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Fragment currentFragment = new MapFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content, currentFragment);
        ft.commit();
    }

}
