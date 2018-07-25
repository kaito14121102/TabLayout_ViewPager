package com.example.minh.tablayout_viewpager.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.minh.tablayout_viewpager.R;

import java.util.ArrayList;

public class FragmentOneAdapter extends RecyclerView.Adapter<FragmentOneAdapter.ViewHolder> {
    private ArrayList<String> list = new ArrayList<>();
    private Context context;

    public FragmentOneAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_one,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String ten = list.get(position);
        holder.name.setText(ten);
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ten, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_view);
        }
    }
}
