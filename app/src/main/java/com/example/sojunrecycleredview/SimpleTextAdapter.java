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


    private ArrayList<Item> mData=null;
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

    SimpleTextAdapter(ArrayList<Item> list){
        mData=list;
    }


    @Override
    public SimpleTextAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        if(viewType== Code.ViewType.History){
            view = inflater.inflate(R.layout.regular_item, parent, false);
            return new Cente(view);
        }
        else if(viewType==Code.ViewType.Regular){
            return new
        }
    }
    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getViewType();
    }


    @Override
    public void onBindViewHolder(@NonNull SimpleTextAdapter.ViewHolder viewHolder, int i) {
        if(viewHolder instanceof RegularViewHolder)
        {
            ((RegularViewHolder) viewHolder).content.setText(mData.get(position).getContent());
        }
        else if(viewHolder instanceof HistoryViewHolder)
        {
            ((HistoryViewHolder) viewHolder).name.setText(mData.get(position).getName());
            ((HistoryViewHolder) viewHolder).content.setText(mData.get(position).getContent());
        }

        Item item =mData.get(i);
        viewHolder.textView.setText(item.getTitleStr());
        viewHolder.imageView.setImageDrawable(item.getIconDrawble());
        viewHolder.decsText.setText(item.getDecStr());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class RegularViewHolder extends RecyclerView.ViewHolder{
        TextView content;

        RegularViewHolder(View itemView)
        {
            super(itemView);

            content = itemView.findViewById(R.id.content);
        }
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder{
        TextView content;
        TextView name;
        ImageView image;

        HistoryViewHolder(View itemView)
        {
            super(itemView);

            content = itemView.findViewById(R.id.content);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.imageView);
        }
    }


}

/*

 */

