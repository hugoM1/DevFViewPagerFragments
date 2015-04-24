package mx.devf.viewpager;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import mx.devf.viewpager.mx.devf.viewpager.fragment.FragmentOne;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.fragment_container);
        linearLayout.setOnClickListener(this);

       if(savedInstanceState == null){
           initView(savedInstanceState);
       }
    }

    private void initView(Bundle args) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, FragmentOne.getInstance(args))
                .commit();
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, ActivityDetailViewPager.class));
    }
}
