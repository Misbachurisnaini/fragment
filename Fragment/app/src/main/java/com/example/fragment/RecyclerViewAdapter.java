package com.example.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List <Contact> mData;
    private BreakIterator tv_nama;
    private BreakIterator tv_tanggal;
    private BreakIterator tv_durasi;
    private Object tv_foto;
    private ImageSwitcher img;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v ;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_call,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    public void onBindViewHolder(@NonNull RecyclerViewAdapter holder, int position) {

        holder.tv_nama.setText(mData.get(position).getNama());
        holder.tv_tanggal.setText(mData.get(position).getTanggal());
        holder.tv_durasi.setText(mData.get(position).getDurasi());
        holder.img.setImageResource(mData.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_nama;
        private TextView tv_tanggal;
        private TextView tv_durasi;
        private ImageView tv_foto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nama  = (TextView) itemView.findViewById(R.id.nama_kontak);
            tv_tanggal= (TextView) itemView.findViewById(R.id.tanggal);
            tv_durasi = (TextView) itemView.findViewById(R.id.jam);
            tv_foto = (ImageView) itemView.findViewById(R.id.img_call);
        }
    }
}
