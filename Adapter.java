package com.example.myapplication3;

import android.content.Context;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private Context mContext;
    private ArrayList<Web> mWeb;

    public Adapter(Context context, ArrayList<Web> website){
        mContext = context;
        mWeb = website;
    }

    @NonNull
    //@org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.example_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {
        Web currItem = mWeb.get(position);

        String title = currItem.getTitle();
        String des = currItem.getDes();
        String url = currItem.getUrl();

        holder.mTitle.setText(title);
        holder.mDes.setText(des);
        holder.mUrl.setText(url);
    }

    @Override
    public int getItemCount() {
        return mWeb.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTitle;
        public TextView mDes;
        public TextView mUrl;


            public ViewHolder(@NonNull  View itemView) {
                super(itemView);

                mTitle = itemView.findViewById(R.id.text_title);
                mDes = itemView.findViewById(R.id.text_des);
                mUrl = itemView.findViewById(R.id.text_url);
                mUrl.setMovementMethod(LinkMovementMethod.getInstance());

            }
        }
}


