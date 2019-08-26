package com.aprianto.bookookoo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class buku_detail extends AppCompatActivity {
    String url;
    public static final String extra_id = "0";
    public static String id1,id2,id3;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_detail);

        //mendapat id dari list yang di klik
        String id = getIntent().getStringExtra(extra_id);

        //arraylist untuk mendapat data detail buku dari method di buku_data
        ArrayList detail = new ArrayList();

        //pencocokan komponen xml
        TextView tv_judul = findViewById(R.id.tv_judul);
        TextView tv_penulis = findViewById(R.id.tv_penulis);
        TextView tv_harga = findViewById(R.id.tv_harga);
        TextView tv_tahun = findViewById(R.id.tv_tahun);
        TextView tv_penerbit = findViewById(R.id.tv_penerbit);
        TextView tv_deskripsi = findViewById(R.id.tv_deskripsi);
        ImageView foto_produk = findViewById(R.id.foto_produk);
        Button btn_beli = findViewById(R.id.btn_beli);              //button beli
        TextView tv_judul1 = findViewById(R.id.judul_slide1);       //judul card suggestion 1
        TextView tv_judul2 = findViewById(R.id.judul_slide2);       //judul card suggestion 2
        TextView tv_judul3 = findViewById(R.id.judul_slide3);       //judul card suggestion 3
        ImageView iv_foto1 = findViewById(R.id.foto_slide1);        //foto card suggestion 1
        ImageView iv_foto2 = findViewById(R.id.foto_slide2);        //foto card suggestion 2
        ImageView iv_foto3 = findViewById(R.id.foto_slide3);        //foto card suggestion 3
        LinearLayout ls1 = findViewById(R.id.slides1);              //cardview suggestion 1
        LinearLayout ls2 = findViewById(R.id.slides2);              //cardview suggestion 2
        LinearLayout ls3 = findViewById(R.id.slides3);              //cardview suggestion 3

        //mengisi arraylist dengan detail buku (method buku_data)
        detail.removeAll(detail);
        detail = buku_data.getDetailView(id);

        //set data detail sesuai data dari arraylist
        tv_judul.setText(detail.get(0).toString());
        tv_penulis.setText(detail.get(1).toString());
        tv_harga.setText(detail.get(2).toString());
        tv_tahun.setText(detail.get(4).toString());
        tv_penerbit.setText(detail.get(5).toString());
        tv_deskripsi.setText(detail.get(7).toString());
        Glide.with(this).load(detail.get(3).toString()).into(foto_produk);
        url = detail.get(6).toString();

        //btn beli redirect ke website gramedia
        btn_beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy = new Intent(Intent.ACTION_VIEW);
                buy.setData(Uri.parse(url));
                startActivity(buy);
            }
        });
        //arraylist untuk mendapat data suggestion (id, judul, link foto)
        ArrayList suggest;

        //mengisi data suggestion dengan method di buku_data (method getSuggest)
        suggest = buku_data.getSuggest(id);

        //set saran buku 1
        tv_judul1.setText(suggest.get(0).toString());
        Glide.with(this).load(suggest.get(1).toString()).into(iv_foto1);
        id1 = suggest.get(2).toString();
        ls1.setOnClickListener(new View.OnClickListener() { //mengarah ke halaman detail sesuai id item  yang di klik
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), buku_detail.class);
                intent.putExtra(buku_detail.extra_id, id1);
                view.getContext().startActivity(intent);
            }
        });

        //set saran buku 2
        tv_judul2.setText(suggest.get(3).toString());
        Glide.with(this).load(suggest.get(4).toString()).into(iv_foto2);
        id2 = suggest.get(5).toString();
        ls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), buku_detail.class);
                intent.putExtra(buku_detail.extra_id, id2);
                view.getContext().startActivity(intent);
            }
        });

        //set saran buku 3
        tv_judul3.setText(suggest.get(6).toString());
        Glide.with(this).load(suggest.get(7).toString()).into(iv_foto3 );
        id3 = suggest.get(8).toString();
        ls3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), buku_detail.class);
                intent.putExtra(buku_detail.extra_id, id3);
                view.getContext().startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //set tombol back
        getSupportActionBar().setTitle("Detail Buku"); //judul toolbar


    }
}
