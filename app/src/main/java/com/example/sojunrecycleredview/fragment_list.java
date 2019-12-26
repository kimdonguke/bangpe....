package com.example.sojunrecycleredview;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class fragment_list extends Fragment {
    Button add_button;
    EditText editText_howmuch,editText_what;
    ImageButton camera_button;
    ArrayList<Item> data=new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context context=getContext();
        View v= inflater.inflate(R.layout.activity_fragment_list, container, false);

//        data.add(addItem(getResources().getDrawable(R.drawable.gomtang),"gimoring1","fuckyou"));
//        data.add(addItem(getResources().getDrawable(R.drawable.honor_3level),"gimoring2","fuckyou"));
//        data.add(addItem(getResources().getDrawable(R.drawable.kimminjun),"gimoring3","fuckyou"));
        RecyclerView recyclerView=v.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        final SimpleTextAdapter simpleTextAdapter=new SimpleTextAdapter(data);
        recyclerView.setAdapter(simpleTextAdapter);
        add_button=v.findViewById(R.id.fragment_list_addbutton);
        editText_howmuch=v.findViewById(R.id.fragment_list_howmuch);
        editText_what=v.findViewById(R.id.fragment_list_what);
        camera_button=v.findViewById(R.id.fragment_list_camerabutton);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add(addItem(camera_button.getDrawable(),editText_howmuch.getText().toString(),editText_what.getText().toString()));
                simpleTextAdapter.notifyDataSetChanged();
            }
        });
        return  v;
    }
    public Item addItem(Drawable icon, String title, String desc){
        Item item= new Item();
        item.setIconDrawble(icon);
        item.setDecStr(desc);
        item.setTitleStr(title);
        return item;
    }
}


