package com.example.sojunrecycleredview;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import android.widget.ImageView;

import java.util.ArrayList;

public class fragment_list extends Fragment {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context context=getContext();
        View v= inflater.inflate(R.layout.activity_fragment_list, container, false);
        ArrayList<Item> data=new ArrayList<>();
//        data.add(addItem(getResources().getDrawable(R.drawable.gomtang),"gimoring1","fuckyou"));
//        data.add(addItem(getResources().getDrawable(R.drawable.honor_3level),"gimoring2","fuckyou"));
//        data.add(addItem(getResources().getDrawable(R.drawable.kimminjun),"gimoring3","fuckyou"));
        RecyclerView recyclerView=v.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        SimpleTextAdapter simpleTextAdapter=new SimpleTextAdapter(data);
        recyclerView.setAdapter(simpleTextAdapter);




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


