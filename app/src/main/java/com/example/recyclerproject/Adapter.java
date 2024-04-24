package com.example.recyclerproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<BlogModel> blogList;

    public Adapter(List<BlogModel> blogList){
        this.blogList=blogList;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.blog_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        String head=blogList.get(position).getTitle();
        String subhead=blogList.get(position).getSubtitle();
        String body=blogList.get(position).getContent();

        holder.setData(head,subhead,body);
    }

    @Override
    public int getItemCount() {
        return blogList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private  TextView subtitle;
        private TextView content;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            subtitle=itemView.findViewById(R.id.subtitle);
            content=itemView.findViewById(R.id.content);
        }

        public void setData(String head, String subhead, String body) {
            title.setText(head);
            subtitle.setText(subhead);
            content.setText(body);

        }
    }
}
