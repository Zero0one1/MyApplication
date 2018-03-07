package com.example.demo3;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.demo3.Adapter.MyFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener{

//    UI Objects
    private RadioGroup rg_tab_bar;
    private RadioButton rb_news;
    private RadioButton rb_courses;
    private RadioButton rb_questions;
    private RadioButton rb_subjects;
    private ViewPager vpager;

//    适配器
    private MyFragmentPagerAdapter mAdapter;

//    几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        rg_tab_bar.setOnCheckedChangeListener(this);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }

//    获取控件的实例并缓存
    private void bindViews() {
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_news = (RadioButton) findViewById(R.id.rb_news);
        rb_courses = (RadioButton) findViewById(R.id.rb_courses);
        rb_questions = (RadioButton) findViewById(R.id.rb_questions);
        rb_subjects = (RadioButton) findViewById(R.id.rb_subjects);
        vpager = (ViewPager) findViewById(R.id.vpager);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_news:
                vpager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_courses:
                vpager.setCurrentItem(PAGE_TWO);
                break;
            case R.id.rb_questions:
                vpager.setCurrentItem(PAGE_THREE);
                break;
            case R.id.rb_subjects:
                vpager.setCurrentItem(PAGE_FOUR);
                break;
        }
    }


    //重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case PAGE_ONE:
                    rb_news.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_courses.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_questions.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_subjects.setChecked(true);
                    break;
            }
        }
    }
}
