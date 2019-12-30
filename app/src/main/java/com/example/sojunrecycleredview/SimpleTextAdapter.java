package com.example.sojunrecycleredview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SimpleTextAdapter extends RecyclerView.Adapter<SimpleTextAdapter.ViewHolder> {

    public  class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView,decsText;
        ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);
            textView=itemView.findViewById(R.id.title_text);
            decsText=itemView.findViewById(R.id.description_text);
            imageView=itemView.findViewById(R.id.item_imageview);
        }
    }
    private ArrayList<Item> mData=null;
    private ArrayList<regular_item> rData=null;
    SimpleTextAdapter(ArrayList<Item> list){
        mData=list;
    }


    @Override
    public SimpleTextAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recycleritem, parent, false) ;
        SimpleTextAdapter.ViewHolder vh = new SimpleTextAdapter.ViewHolder(view) ;

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleTextAdapter.ViewHolder viewHolder, int i) {
        Item item =mData.get(i);
        viewHolder.textView.setText(item.getTitleStr());
        viewHolder.imageView.setImageDrawable(item.getIconDrawble());
        viewHolder.decsText.setText(item.getDecStr());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}


