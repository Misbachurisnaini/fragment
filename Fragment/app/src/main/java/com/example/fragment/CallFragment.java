package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class CallFragment extends Fragment {

    View v ;
    private RecyclerView myrecyclerview;
    private List<Contact> kontak;

    public CallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_call,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.call_rey);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), kontak);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        kontak  = new ArrayList<>();
        kontak.add(new Contact("Kim Doyoung" , "10 Oktober 2021" , "19.00" , R.drawable.doyoung));
        kontak.add(new Contact("Lee Haechan" , "9 Oktober 2021" , "19.00" , R.drawable.haechan));
        kontak.add(new Contact("Jung Jaehyun" , "8 Oktober 2021" , "19.00" , R.drawable.jaehyun));
        kontak.add(new Contact("Na Jaemin" , "7 Oktober 2021" , "19.00" , R.drawable.jaemin));
        kontak.add(new Contact("Lee Jeno" , "6 Oktober 2021" , "19.00" , R.drawable.jeno));
        kontak.add(new Contact("Park Jisung" , "5 Oktober 2021" , "19.00" , R.drawable.jisung));
        kontak.add(new Contact("Lucas" , "4 Oktober 2021" , "19.00" , R.drawable.lucas));
        kontak.add(new Contact("Mark Lee" , "3 Oktober 2021" , "19.00" , R.drawable.mark));
        kontak.add(new Contact("Lee Taeyong" , "2 Oktober 2021" , "19.00" , R.drawable.taeyong));
        kontak.add(new Contact("Dong Xi Cheng" , "1 Oktober 2021" , "19.00" , R.drawable.winwin));
    }
}