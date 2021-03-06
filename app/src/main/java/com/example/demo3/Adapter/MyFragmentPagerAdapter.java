package com.example.demo3.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.demo3.Fragment.FragmentCourse;
import com.example.demo3.Fragment.FragmentNews;
import com.example.demo3.Fragment.FragmentQuestion;
import com.example.demo3.Fragment.FragmentSubject;

/**
 * Created by arye on 2018/3/7.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private FragmentNews myFragment1 = null;
    private FragmentCourse myFragment2 = null;
    private FragmentQuestion myFragment3 = null;
    private FragmentSubject myFragment4 = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        myFragment1 = new FragmentNews();
        myFragment2 = new FragmentCourse();
        myFragment3 = new FragmentQuestion();
        myFragment4 = new FragmentSubject();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = myFragment1;
                break;
            case 1:
                fragment = myFragment2;
                break;
            case 2:
                fragment = myFragment3;
                break;
            case 3:
                fragment = myFragment4;
                break;
        }
        return fragment;
    }

}
