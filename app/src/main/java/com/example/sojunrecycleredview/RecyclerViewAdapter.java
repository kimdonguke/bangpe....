package com.example.sojunrecycleredview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView sellername, thatdate,maintext ;
        ImageView profile;
        ViewHolder(View itemView){
            super(itemView);
//            sellername = itemView.findViewById(R.id.borrowservice_item_sellersname);
//            thatdate=itemView.findViewById(R.id.borrowservice_item_thatdate);
//            maintext=itemView.findViewById(R.id.borrowservice_item_maintext);
//            profile=itemView.findViewById(R.id.onItem_profile_image);
        }
    }
    // 생성자에서 데이터 리스트 객체를 전달받음.
    RecyclerViewAdapter(ArrayList<String> list1, ArrayList<String> list2, ArrayList<String> list3,ArrayList<ImageView> list4) { // ArrayList<Image> list4 만들기
//        mData = list1;
//        iData = list2;
//        jData = list3;
//        imageData=list4;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recycleritem, parent, false) ;
        RecyclerViewAdapter.ViewHolder vh = new RecyclerViewAdapter.ViewHolder(view) ;
        return vh;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
//        String text = mData.get(position) ;
//        String text2=iData.get(position);
//        String text3=jData.get(position);
//        ImageView profile=imageData.get(position);
//        holder.sellername.setText(text) ;
//        holder.thatdate.setText(text2);
//        holder.maintext.setText(text3 );
//        //holder.profile.setImageResource(profile);
//        //drawable 에서 가져오기 여기로
    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return 0;
//        return mData.size() ;
    }
}