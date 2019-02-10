package com.example.whatsapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatsFragment extends Fragment {


    FloatingActionButton floatingChatActionButton;
    public ChatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_chats, container, false);

        floatingChatActionButton=view.findViewById(R.id.float_chat_icon);
        floatingChatActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), SelectContact.class);
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return view;


    }

}
