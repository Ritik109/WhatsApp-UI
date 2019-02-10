package com.example.whatsapp;


import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // convert toolbar as action bar
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("WhatsApp");
        toolbar.setTitleTextColor(getColor(R.color.colorWhite));

        tabLayout=findViewById(R.id.tabLayout);

        //custom size camera tab
        LinearLayout linearLayout=((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(0));
        LinearLayout.LayoutParams layoutParams=(LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.weight=0.4f;
        linearLayout.setLayoutParams(layoutParams);


        // tab items references
        viewPager=findViewById(R.id.view);



        //set page adepter to view pager
        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        // updating tab indicator in tablayout
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.setCurrentItem(1);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == 0) {
                    viewPager.setCurrentItem(0);

                }
                else if (tab.getPosition() == 1) {
                    viewPager.setCurrentItem(1);

                }
                else if (tab.getPosition() == 2) {
                    viewPager.setCurrentItem(2);

                }
                else {
                    viewPager.setCurrentItem(3);

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    /*adding menu to action bar from resource menu*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    /*getting response from menu items*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.new_group:

                break;
            case R.id.new_broadcast:

                break;
            case R.id.whatsapp_web:

                break;
            case R.id.starred_msgs:

                break;
            case R.id.setting:

                break;
        }
        return super.onOptionsItemSelected(item);

        }




    }

