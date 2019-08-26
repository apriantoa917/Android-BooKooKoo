package com.aprianto.bookookoo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class buku_clvAdapter extends RecyclerView.Adapter<buku_clvAdapter.CardListHolder> {

    //deklarasi array of class
    private ArrayList<buku_model> listBuku;

    //constructor
    public buku_clvAdapter(ArrayList<buku_model> list) {
        this.listBuku = list;
    }


    @NonNull
    @Override
    public CardListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlist_home, parent, false);
        return new CardListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardListHolder holder, int position) {

        buku_model bm = listBuku.get(position);

        Glide.with(holder.itemView.getContext())
                .load(bm.getFoto_buku())
                .apply(new RequestOptions().override(350,550))
                .into(holder.foto_produk);

        holder.tv_judul.setText(bm.getJudul_buku());

        holder.tv_penulis.setText(bm.getNama_penulis());

        holder.tv_harga.setText(bm.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  judul = listBuku.get(holder.getAdapterPosition()).getId();
                Intent intent = new Intent(view.getContext(), buku_detail.class);
                intent.putExtra(buku_detail.extra_id, judul);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBuku.size();
    }

    public class CardListHolder extends RecyclerView.ViewHolder {
        //deklarasi komponen
        ImageView foto_produk;
        TextView tv_judul, tv_penulis, tv_harga;
        public CardListHolder(@NonNull View itemView) {
            super(itemView);
            //inisialisasi komponen
            foto_produk = itemView.findViewById(R.id.foto_produk);
            tv_judul = itemView.findViewById(R.id.tv_judul);
            tv_penulis = itemView.findViewById(R.id.tv_penulis);
            tv_harga = itemView.findViewById(R.id.tv_harga);
        }
    }
}
