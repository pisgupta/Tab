package pankaj.com.tabproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by gupta on 9/20/2015.
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {
    int noOfTab;

    public TabPagerAdapter(FragmentManager fm, int noOfTab) {
        super(fm);
        this.noOfTab = noOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentFirst first = new FragmentFirst();
                return first;
            case 1:
                FragmentSecond second = new FragmentSecond();
                return second;
            case 2:
                FragmentThird third = new FragmentThird();
                return third;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTab;
    }
}
