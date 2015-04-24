package mx.devf.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import java.util.ArrayList;

import mx.devf.viewpager.mx.devf.viewpager.adapter.FragmentViewPagerAdapter;
import mx.devf.viewpager.mx.devf.viewpager.fragment.FragmentOne;
import mx.devf.viewpager.mx.devf.viewpager.fragment.FragmentThree;
import mx.devf.viewpager.mx.devf.viewpager.fragment.FragmentTwo;


public class ActivityDetailViewPager extends ActionBarActivity {

    private ViewPager viewPager;
    private FragmentViewPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_detail_view_pager);

        initView(savedInstanceState);
    }

    private void initView(Bundle savedInstanceState) {
        viewPager = (ViewPager) findViewById(R.id.pager);

        fragments.add(FragmentOne.getInstance(savedInstanceState));
        fragments.add(FragmentTwo.getInstance(savedInstanceState));
        fragments.add(FragmentThree.getInstance(savedInstanceState));

        pagerAdapter = new FragmentViewPagerAdapter(getSupportFragmentManager(), this, fragments);

        viewPager.setAdapter(pagerAdapter);
    }
}
