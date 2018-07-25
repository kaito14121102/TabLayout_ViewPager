package com.example.minh.tablayout_viewpager.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minh.tablayout_viewpager.Adapter.FragmentOneAdapter;
import com.example.minh.tablayout_viewpager.R;

import java.util.ArrayList;

public class FragmentOne extends Fragment {

    ArrayList<String> list ;
    RecyclerView recyclerView;
    FragmentOneAdapter adapter;
    public FragmentOne() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);

        recyclerView = view.findViewById(R.id.recycle_view);
        list  = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        adapter = new FragmentOneAdapter(list,getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
