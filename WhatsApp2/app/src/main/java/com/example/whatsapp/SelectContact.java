package com.example.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class SelectContact extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_contact);

        toolbar = findViewById(R.id.all_contact_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select contact");
        getSupportActionBar().setSubtitle("134 contacts");
        toolbar.setSubtitleTextColor(getColor(R.color.colorWhite));
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        toolbar.setTitleTextColor(getColor(R.color.colorWhite));

        recyclerView=findViewById(R.id.contacts_recycler);
        recyclerView.setHasFixedSize(true);
        manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);


        //creats and set Adapter for list items
        String[] myDataset={"name 1","Name 2","Name 3","name 1","Name 2","Name 3"};
        mAdapter=new ContactsAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);


    }

    //get menu in action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.select_contact_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.invite_friend:

                break;
            case R.id.contacts:

                break;
            case R.id.help:

                break;
            case R.id.refresh:

                break;

        }
        return super.onOptionsItemSelected(item);

    }


}


